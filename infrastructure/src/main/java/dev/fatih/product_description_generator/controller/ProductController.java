package dev.fatih.product_description_generator.controller;

import dev.fatih.product_description_generator.Product;
import dev.fatih.product_description_generator.application.port.in.GenerateDescriptionInputPort;
import dev.fatih.product_description_generator.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final GenerateDescriptionInputPort inputPort;

    @PostMapping("/description")
    public String generateDescription(@RequestBody ProductDTO productDTO) {
        Product product = new Product(
                productDTO.getName(),
                productDTO.getCategory(),
                productDTO.getFeatures()
        );
        return inputPort.generateDescription(product);
    }
}
