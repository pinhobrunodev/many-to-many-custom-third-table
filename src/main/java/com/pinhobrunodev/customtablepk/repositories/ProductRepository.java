package com.pinhobrunodev.customtablepk.repositories;

import com.pinhobrunodev.customtablepk.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
