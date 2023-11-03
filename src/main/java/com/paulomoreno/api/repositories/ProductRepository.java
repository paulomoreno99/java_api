package com.paulomoreno.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulomoreno.api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
