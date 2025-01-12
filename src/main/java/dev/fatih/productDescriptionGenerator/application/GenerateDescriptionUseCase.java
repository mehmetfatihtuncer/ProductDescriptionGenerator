package dev.fatih.productDescriptionGenerator.application;

import dev.fatih.productDescriptionGenerator.application.port.ChatPort;
import dev.fatih.productDescriptionGenerator.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class GenerateDescriptionUseCase {

    private final ChatPort chatPort;

    public GenerateDescriptionUseCase(ChatPort chatPort) {
        this.chatPort = chatPort;
    }

    public String generateDescription(Product product) {
        String promptMessage = "Ürün adı: " + product.getName()
                + ", Kategori: " + product.getCategory()
                + ", Özellikler: " + product.getFeatures()
                + ". Ürün için yaratıcı bir pazarlama açıklaması oluştur.";

        return chatPort.getChatResponse(promptMessage);
    }
}
