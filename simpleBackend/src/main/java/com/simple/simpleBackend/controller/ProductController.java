package com.simple.simpleBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.simpleBackend.model.Product;
import com.simple.simpleBackend.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService service;
    
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProductsFromService();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){ // we are using the variable which is being passed in the request query path 
        return service.getProductByIdFromService(prodId);
    }
    
}
