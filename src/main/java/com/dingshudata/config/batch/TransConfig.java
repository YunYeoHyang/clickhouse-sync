package com.dingshudata.config.batch;

import com.dingshudata.batch.tables.TransProcessor;
import com.dingshudata.config.ApplicationProperties;
import com.dingshudata.config.ClickHouseProperties;
import com.dingshudata.entity.tables.Trans;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
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
public class TransConfig {

    private final StepBuilderFactory steps;

    private final DataSource dateSource;

    public TransConfig(StepBuilderFactory steps, ClickHouseProperties properties) {
        this.steps = steps;
        this.dateSource = properties.initializeDataSourceBuilder().build();
    }

    @Bean("transStep")
    public Step step(
            @Qualifier("transReader") FlatFileItemReader<Trans> reader,
            TransProcessor transProcessor,
            @Qualifier("transWriter") JdbcBatchItemWriter<Map<String, Object>> writer) {
        return steps.get("transStep")
                .<Trans, LinkedHashMap<String, Object>>chunk(1000)
                .reader(reader)
                .processor(transProcessor)
                .writer(writer)
                .faultTolerant()
                .skipLimit(1000)
                .noSkip(FileNotFoundException.class)
                .retry(Exception.class).retryLimit(3)
                .stream(reader)
                .build();
    }

    @Bean("transReader")
    @StepScope
    public FlatFileItemReader<Trans> itemReader(ApplicationProperties applicationProperties, @Value("#{jobParameters['transFile']}") Resource resource) {
        DefaultLineMapper<Trans> lineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        String[] names = Arrays.stream(Trans.class.getDeclaredFields()).map(Field::getName).toArray(String[]::new);
        tokenizer.setNames(names);
        tokenizer.setDelimiter(applicationProperties.getDelimiter());
        tokenizer.setStrict(false);
        lineMapper.setLineTokenizer(tokenizer);
        BeanWrapperFieldSetMapper<Trans> wrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
        wrapperFieldSetMapper.setTargetType(Trans.class);
        lineMapper.setFieldSetMapper(wrapperFieldSetMapper);
        return new FlatFileItemReaderBuilder<Trans>()
                .name("transReader")
                .resource(resource)
                .encoding(applicationProperties.getFileEncoding())
                .lineMapper(lineMapper)
                .build();
    }

    @Bean("transWriter")
    @StepScope
    public JdbcBatchItemWriter<Map<String, Object>> writer(ApplicationProperties applicationProperties) {
        List<String> names = Arrays.stream(Trans.class.getDeclaredFields()).map(Field::getName).collect(Collectors.toList());
        String sql = String.format("insert into %s values ( %s )", applicationProperties.getSchema(), names.stream().map(s -> "?").collect(Collectors.joining(",")));
        ColumnMapItemPreparedStatementSetter statementSetter = new ColumnMapItemPreparedStatementSetter();
        return new JdbcBatchItemWriterBuilder<Map<String, Object>>()
                .dataSource(this.dateSource)
                .sql(sql)
                .itemSqlParameterSourceProvider(MapSqlParameterSource::new)
                .itemPreparedStatementSetter(statementSetter)
                .build();
    }
}
