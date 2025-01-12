package dev.fatih.productDescriptionGenerator.adapter.controller;

import dev.fatih.productDescriptionGenerator.application.GenerateDescriptionUseCase;
import dev.fatih.productDescriptionGenerator.domain.Product;
import dev.fatih.productDescriptionGenerator.adapter.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final GenerateDescriptionUseCase useCase;

    @PostMapping("/description")
    public String generateDescription(@RequestBody ProductDTO productDTO) {
        Product product = new Product(
                productDTO.getName(),
                productDTO.getCategory(),
                productDTO.getFeatures()
        );

        return useCase.generateDescription(product);
    }
}
