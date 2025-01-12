package dev.fatih.productDescriptionGenerator.adapter.controller;

import dev.fatih.productDescriptionGenerator.application.port.ChatPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ChatController {

    private final ChatPort chatPort;

    @GetMapping("/joke")
    public String joke() {
        return chatPort.getChatResponse("Make a joke about internet");
    }
}
