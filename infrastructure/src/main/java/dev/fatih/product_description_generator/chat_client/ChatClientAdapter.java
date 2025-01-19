package dev.fatih.product_description_generator.chat_client;

import dev.fatih.product_description_generator.application.port.out.ChatOutputPort;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class ChatClientAdapter implements ChatOutputPort {

    private final ChatClient chatClient;

    public ChatClientAdapter(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @Override
    public String getChatResponse(String userMessage) {
        try {
            return chatClient.prompt()
                    .user(userMessage)
                    .call()
                    .content();
        } catch (Exception e) {
            return "Ollama API'ye bağlanılamadı: " + e.getMessage();
        }
    }
}
