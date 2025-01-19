package dev.fatih.product_description_generator.application.port.out;

public interface ChatOutputPort {
    String getChatResponse(String userMessage);
}
