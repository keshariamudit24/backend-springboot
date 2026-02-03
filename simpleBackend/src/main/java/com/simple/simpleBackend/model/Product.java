package com.simple.simpleBackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    // getter and setter methods handled by lombok (ex: getProdId())
} 

// add lombok dependency in pom.xml from "maven repository"
