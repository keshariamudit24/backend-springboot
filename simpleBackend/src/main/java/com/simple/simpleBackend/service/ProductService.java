package com.simple.simpleBackend.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.simple.simpleBackend.model.Product;
import com.simple.simpleBackend.repository.ProductRepo;

@RestController
public class ProductService {

    @Autowired
    ProductRepo repo;

    // creating in memory dummy data 
    // List<Product> products = new ArrayList<>(Arrays.asList(
    //     new Product( 101, "Iphone", 50000), 
    //     new Product( 102, "Camera", 70000)
    // ));
    
    // @RequestMapping("/products/get")
    public List<Product> getProductsFromService(){
        // return products;
        return repo.findAll();
    }

    public Product getProductByIdFromService(int prodId){
        // return products.stream()
        //         .filter(p -> p.getProdId() == prodId)
        //         .findFirst().get();

        // Product reqProduct = null;
        // for(int i = 0; i < products.size(); i++){
        //     if(products.get(i).getProdId() == prodId){
        //         reqProduct = products.get(i);
        //         break;
        //     }
        // }
        // return reqProduct;
        
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product){
        // products.add(product);
        repo.save(product);
    }

    public void updateProduct(Product prod){
        // int pId = -1;
        // for(int i = 0; i < products.size(); i++){
        //     // System.out.println(products.get(i));
        //     if(products.get(i).getProdId() == prod.getProdId()){
        //         pId = i;
        //         break;
        //     }
        // }
        // if(pId != -1){
        //     products.set(pId, prod);
        // }

        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        // int pId = -1;
        // for(int i = 0; i < products.size(); i++){
        //     if(products.get(i).getProdId() == prodId){
        //         pId = i;
        //         break;
        //     }
        // }
        // if(pId != -1){
        //     products.remove(pId);
        // }

        repo.deleteById(prodId);
    }

}
