package dev.fatih.productDescriptionGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dev.fatih.productDescriptionGenerator")
public class ProductDescriptionGenerator {

	public static void main(String[] args) {
		SpringApplication.run(ProductDescriptionGenerator.class, args);
	}

}
