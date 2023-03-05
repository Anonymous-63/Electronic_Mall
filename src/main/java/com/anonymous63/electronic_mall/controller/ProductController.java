package com.anonymous63.electronic_mall.controller;

import com.anonymous63.electronic_mall.dao.ProductRepository;
import com.anonymous63.electronic_mall.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepo;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.productRepo.findAll();
    }

    @GetMapping("/products/{productId}")
    public Optional<Product> getProduct(@PathVariable String productId){
        return this.productRepo.findById(Integer.valueOf(productId));
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return this.productRepo.save(product);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        List<Product> productList = this.productRepo.findAll();
        for (Product p: productList) {
            if (p.getProductId() == product.getProductId()){
                return this.productRepo.save(product);
            }
        }
        return null;
    }
}
