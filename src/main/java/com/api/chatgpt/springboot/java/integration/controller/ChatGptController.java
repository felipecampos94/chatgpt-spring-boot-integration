package com.api.chatgpt.springboot.java.integration.controller;

import com.api.chatgpt.springboot.java.integration.service.ChatGptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatGptController {
    private final ChatGptService chatGptService;

    @PostMapping
    public String chat(@RequestBody String prompt) {
        return this.chatGptService.chat(prompt);
    }
}
