package io.github.emersonl33.productsapi.model;

<<<<<<< HEAD
public class Product {
    private String id;
    private String productName;
    private String description;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
=======

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
>>>>>>> 86d2c8cdc05a4fe930ac465ee4d654963b3c747d
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
