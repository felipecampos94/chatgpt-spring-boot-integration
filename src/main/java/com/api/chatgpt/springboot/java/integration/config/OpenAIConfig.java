package com.api.chatgpt.springboot.java.integration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Configuration
public class OpenAIConfig {
    private final Logger logger = Logger.getLogger(OpenAIConfig.class.getName());

    @Value("${openai.api.key}")
    private String openApiKey;

    @Bean
    public RestTemplate restTemplate() {
        logger.info("Initializing RestTemplate");
        return new RestTemplateBuilder().interceptors((request, body, execution) -> {
            request.getHeaders().add("Authorization", "Bearer " + openApiKey);
            return execution.execute(request, body);
        }).build();
    }
}
