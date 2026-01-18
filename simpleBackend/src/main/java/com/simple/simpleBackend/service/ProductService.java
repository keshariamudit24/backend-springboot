package com.simple.simpleBackend.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.simpleBackend.model.Product;

@RestController
public class ProductService {

    // creating in memory dummy data 
    List<Product> products = Arrays.asList(
        new Product( 101, "Iphone", 50000), 
        new Product( 102, "Camera", 70000)
    );
    
    @RequestMapping("/products/get")
    public List<Product> getProducts(){
        return products;
    }

}
