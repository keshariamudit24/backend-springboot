package com.simple.simpleBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simple.simpleBackend.model.Product;
import com.simple.simpleBackend.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService service;
    
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProductsFromService();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){ // we are using the variable which is being passed in the request query path 
        return service.getProductByIdFromService(prodId);
    }
    
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){ // we want the data sent by the user to POST in the database. that's why we use RequestBody annotation
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){ // here also we want the data sent by the user to update so we use the RequestBody annotation
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
