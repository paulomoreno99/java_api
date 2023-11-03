package com.paulomoreno.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulomoreno.api.entities.Product;
import com.paulomoreno.api.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> ListDep() {
       
        List<Product> list = productRepository.findAll();
        return list;
        
        
        
    }
    
}
