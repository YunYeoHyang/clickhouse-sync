package com.dingshudata.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationPropertiesScan
@ConfigurationProperties(prefix = "application.clickhouse")
public class ClickHouseProperties {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public DataSourceBuilder<?> initializeDataSourceBuilder() {
        return DataSourceBuilder
                .create()
                .driverClassName(this.getDriverClassName())
                .url(this.getUrl())
                .username(this.getUsername())
                .password(this.getPassword());
    }


    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
