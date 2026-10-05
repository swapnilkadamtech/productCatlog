package com.productManagementCatlog.productCatlog.controllers;

import com.productManagementCatlog.productCatlog.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    List<Product> getProducts() {
        List<Product> productsList = new ArrayList<>();
        Product p1 = new Product();
        p1.setId(1L);
        p1.setName("Swapnil");
        productsList.add(p1);
        return productsList;
    }

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable Long id) {
        Product p1 = new Product();
        p1.setId(id);
        return p1;
    }

    @PostMapping("/products")
    Product addProduct(Product product) {
        return product;
    }

}
