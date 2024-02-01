package com.api.chatgpt.springboot.java.integration.service;

import com.api.chatgpt.springboot.java.integration.model.request.ChatGptRequest;
import com.api.chatgpt.springboot.java.integration.model.response.ChatGptResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class ChatGptService {
    private final Logger logger = Logger.getLogger(ChatGptService.class.getName());

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String url;

    private final RestTemplate restTemplate;

    public String chat(String prompt) {
        logger.info("Starting Prompt");
        var request = new ChatGptRequest(model, prompt);

        logger.info("Processing Prompt");
        var response = this.restTemplate.postForObject(url, request, ChatGptResponse.class);

        logger.info("Returning Prompt");
        return Objects.requireNonNull(response).getChoices().getFirst().getMessage().getContent();
    }
}
