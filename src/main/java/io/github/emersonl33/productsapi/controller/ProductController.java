package io.github.emersonl33.productsapi.controller;

import io.github.emersonl33.productsapi.model.Product;
<<<<<<< HEAD
=======
import io.github.emersonl33.productsapi.repository.ProductsRepository;
>>>>>>> 86d2c8cdc05a4fe930ac465ee4d654963b3c747d
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
=======
import java.util.UUID;

>>>>>>> 86d2c8cdc05a4fe930ac465ee4d654963b3c747d
@RestController
@RequestMapping("products")
public class ProductController {

<<<<<<< HEAD
    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Product received: " + product);
=======
    private ProductsRepository productsRepository;

    public ProductController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Product received: " + product);
        productsRepository.save(product);
>>>>>>> 86d2c8cdc05a4fe930ac465ee4d654963b3c747d
        return product;
    }
}
