package com.ust.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@Slf4j
public class AppConfig {

    @Value("${weather.api.url}")
    private String weatherApiUrl;

    @Bean
    public RestClient restClient() {
        log.info("Weather API URL: {}", weatherApiUrl);
        return RestClient.create(weatherApiUrl);
    }
}

