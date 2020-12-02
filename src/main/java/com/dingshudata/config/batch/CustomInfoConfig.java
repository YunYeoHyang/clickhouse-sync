package com.dingshudata.config.batch;

import com.dingshudata.batch.tables.CustomInfoProcessor;
import com.dingshudata.config.ApplicationProperties;
import com.dingshudata.config.ClickHouseProperties;
import com.dingshudata.entity.tables.CustomInfo;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.database.support.ColumnMapItemPreparedStatementSetter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class CustomInfoConfig {

    private final JobBuilderFactory jobs;

    private final StepBuilderFactory steps;

    private final DataSource dateSource;

    public CustomInfoConfig(JobBuilderFactory jobs , StepBuilderFactory steps, ClickHouseProperties properties) {
        this.jobs = jobs;
        this.steps = steps;
        this.dateSource = properties.initializeDataSourceBuilder().build();
    }

    @Bean("customInfoJob")
    public Job job(
            @Qualifier("customInfoStep") Step step) {
        return jobs.get("customInfoJob")
                .incrementer(new RunIdIncrementer())
                .flow(step)
                .end()
                .build();
    }

    @Bean("customInfoStep")
    public Step step(
            @Qualifier("customInfoReader") FlatFileItemReader<CustomInfo> reader,
            CustomInfoProcessor customInfoProcessor,
            @Qualifier("customInfoWriter") JdbcBatchItemWriter<Map<String, Object>> writer) {
        return steps.get("customInfoStep")
                .<CustomInfo, LinkedHashMap<String, Object>>chunk(1000)
                .reader(reader)
                .processor(customInfoProcessor)
                .writer(writer)
                .faultTolerant()
                .skipLimit(1000)
                .noSkip(FileNotFoundException.class)
                .retry(Exception.class).retryLimit(3)
                .stream(reader)
                .build();
    }

    @Bean("customInfoReader")
    @StepScope
    public FlatFileItemReader<CustomInfo> itemReader(ApplicationProperties applicationProperties, @Value("#{jobParameters['customInfoFile']}") Resource resource) {
        DefaultLineMapper<CustomInfo> lineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        String[] names = Arrays.stream(CustomInfo.class.getDeclaredFields()).map(Field::getName).toArray(String[]::new);
        tokenizer.setNames(names);
        tokenizer.setDelimiter(applicationProperties.getDelimiter());
        tokenizer.setStrict(false);
        lineMapper.setLineTokenizer(tokenizer);
        BeanWrapperFieldSetMapper<CustomInfo> wrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
        wrapperFieldSetMapper.setTargetType(CustomInfo.class);
        lineMapper.setFieldSetMapper(wrapperFieldSetMapper);
        return new FlatFileItemReaderBuilder<CustomInfo>()
                .name("customInfoReader")
                .resource(resource)
                .encoding(applicationProperties.getFileEncoding())
                .lineMapper(lineMapper)
                .build();
    }

    @Bean("customInfoWriter")
    @StepScope
    public JdbcBatchItemWriter<Map<String, Object>> writer(ApplicationProperties applicationProperties) {
        List<String> names = Arrays.stream(CustomInfo.class.getDeclaredFields()).map(Field::getName).collect(Collectors.toList());
        String sql = String.format("insert into %s values ( %s )", applicationProperties.getCustomInfoSchema(), names.stream().map(s -> "?").collect(Collectors.joining(",")));
        ColumnMapItemPreparedStatementSetter statementSetter = new ColumnMapItemPreparedStatementSetter();
        return new JdbcBatchItemWriterBuilder<Map<String, Object>>()
                .dataSource(this.dateSource)
                .sql(sql)
                .itemSqlParameterSourceProvider(MapSqlParameterSource::new)
                .itemPreparedStatementSetter(statementSetter)
                .build();
    }
}
