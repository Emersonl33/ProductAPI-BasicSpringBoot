package io.github.emersonl33.productsapi.repository;

import io.github.emersonl33.productsapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, String> {

}
