package com.dingshudata.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.integration.launch.JobLaunchRequest;
import org.springframework.batch.integration.launch.JobLaunchingGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.dsl.Files;
import org.springframework.integration.file.filters.CompositeFileListFilter;
import org.springframework.integration.file.filters.FileSystemPersistentAcceptOnceFileListFilter;
import org.springframework.integration.file.filters.RegexPatternFileListFilter;
import org.springframework.integration.handler.LoggingHandler;
import org.springframework.integration.metadata.PropertiesPersistingMetadataStore;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.io.File;
import java.util.Arrays;

@Configuration
@EnableScheduling
@EnableBatchProcessing
@EnableIntegration
public class IntegrationConfiguration {

    @Bean("jobTaskExecutor")
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(20);
        taskExecutor.setMaxPoolSize(64);
        return taskExecutor;
    }

    @Bean
    public JobLaunchingGateway jobLaunchingGateway(JobRepository jobRepository, @Qualifier("jobTaskExecutor") TaskExecutor taskExecutor) {
        SimpleJobLauncher simpleJobLauncher = new SimpleJobLauncher();
        simpleJobLauncher.setJobRepository(jobRepository);
        simpleJobLauncher.setTaskExecutor(taskExecutor);
        return new JobLaunchingGateway(simpleJobLauncher);
    }

    @Bean("metadataStore")
    public PropertiesPersistingMetadataStore metadataStore(ApplicationProperties applicationProperties) {
        PropertiesPersistingMetadataStore metadataStore = new PropertiesPersistingMetadataStore();
        metadataStore.setBaseDirectory(applicationProperties.getMetadataDir());
        return metadataStore;
    }

    @Bean
    public IntegrationFlow fromFile(Job job, JobLaunchingGateway jobLaunchingGateway, ApplicationProperties applicationProperties, @Qualifier("metadataStore") PropertiesPersistingMetadataStore persistingMetadataStore) {
        FileSystemPersistentAcceptOnceFileListFilter fileListFilter = new FileSystemPersistentAcceptOnceFileListFilter(persistingMetadataStore, "");
        fileListFilter.setFlushOnUpdate(true);
        return IntegrationFlows
                .from(Files.inboundAdapter(new File(applicationProperties.getInputDirectory()))
                                .useWatchService(true)
                                .watchEvents(FileReadingMessageSource.WatchEventType.CREATE, FileReadingMessageSource.WatchEventType.MODIFY)
                                .ignoreHidden(true)
                                .ignoreHidden(true)
                                .filter(new CompositeFileListFilter(Arrays.asList(
                                        new RegexPatternFileListFilter("DSP_CUSTINFO.txt"),
                                        fileListFilter
                                )))
                        , e -> e.poller(Pollers.fixedDelay(5000).maxMessagesPerPoll(-1)
                                .errorChannel(jobStatusChannel()))
                                .id("fileInboundChannelAdapter"))
                .transform((File file) -> {
                    JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
                    jobParametersBuilder.addString("inputFile", file.toURI().toString());
                    return new JobLaunchRequest(job, jobParametersBuilder.toJobParameters());
                })
                .handle(jobLaunchingGateway)
                .log(LoggingHandler.Level.INFO, "Clickhouse Sync Job")
                .get();

    }

    @Bean
    public MessageChannel jobStatusChannel() {
        return MessageChannels.publishSubscribe().get();
    }
}
