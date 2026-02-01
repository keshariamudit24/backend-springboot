package com.simple.simpleBackend.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int prodId;
    private String prodName;
    private int price;

    // getter and setter methods handled by lombok (ex: getProdId())
} 

// add lombok dependency in pom.xml from "maven repository"
