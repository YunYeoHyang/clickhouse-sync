package com.dingshudata.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationPropertiesScan
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {
    private String inputDirectory;
    private String metadataDir;
    private String fileEncoding;
    private String delimiter;
    private String schema;
}
