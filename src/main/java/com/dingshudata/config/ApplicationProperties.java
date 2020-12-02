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
    private String creditDirectory;
    private String creditCardDirectory;
    private String cardMCCDirectory;
    private String customInfoDirectory;
    private String financialDirectory;
    private String transDirectory;
    private String metadataDir;
    private String fileEncoding = "UTF-8";
    private String delimiter;
    private String creditSchema;
    private String creditCardSchema;
    private String cardMCCSchema;
    private String customInfoSchema;
    private String financialSchema;
    private String transSchema;
}
