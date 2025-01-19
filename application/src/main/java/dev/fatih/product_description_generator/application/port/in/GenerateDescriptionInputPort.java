package dev.fatih.product_description_generator.application.port.in;


import dev.fatih.product_description_generator.Product;

public interface GenerateDescriptionInputPort {
    String generateDescription(Product product);
}
