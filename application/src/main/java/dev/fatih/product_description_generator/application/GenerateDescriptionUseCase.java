package dev.fatih.product_description_generator.application;

import dev.fatih.product_description_generator.Product;
import dev.fatih.product_description_generator.application.port.in.GenerateDescriptionInputPort;
import dev.fatih.product_description_generator.application.port.out.ChatOutputPort;
import org.springframework.stereotype.Service;


@Service
public class GenerateDescriptionUseCase implements GenerateDescriptionInputPort {

    private final ChatOutputPort chatOutputPort;

    public GenerateDescriptionUseCase(ChatOutputPort chatOutputPort) {
        this.chatOutputPort = chatOutputPort;
    }

    @Override
    public String generateDescription(Product product) {
        String prompt = "Ürün adı: " + product.getName() +
                ", Kategori: " + product.getCategory() +
                ", Özellikler: " + product.getFeatures() +
                ". Ürün için yaratıcı bir pazarlama açıklaması oluştur.";
        return chatOutputPort.getChatResponse(prompt);
    }
}
