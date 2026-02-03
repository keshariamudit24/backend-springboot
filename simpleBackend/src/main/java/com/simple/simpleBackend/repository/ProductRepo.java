package com.simple.simpleBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simple.simpleBackend.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}