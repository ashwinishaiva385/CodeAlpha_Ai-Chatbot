package com.codealpha.ai_chatbot.controller;

import com.codealpha.ai_chatbot.model.ChatRequest;
import com.codealpha.ai_chatbot.model.ChatResponse;
import com.codealpha.ai_chatbot.service.ChatbotService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class ChatbotController {

    private final ChatbotService chatbotService;

    public ChatbotController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the AI Chatbot!";
    }

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest request) {

        String message = request.getMessage();

        String response = chatbotService.generateResponse(message);

        return new ChatResponse(response);
    }
}