package dev.fatih.productDescriptionGenerator.infastructure.chatClient;

import dev.fatih.productDescriptionGenerator.application.port.ChatPort;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class ChatClientAdapter implements ChatPort {

    private final ChatClient chatClient;

    public ChatClientAdapter(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @Override
    public String getChatResponse(String userMessage) {
        return chatClient.prompt()
                .user(userMessage)
                .call()
                .content();
    }
}
