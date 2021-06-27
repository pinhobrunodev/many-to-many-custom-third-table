package com.pinhobrunodev.customtablepk.controller;

import com.pinhobrunodev.customtablepk.dtos.Product.ProductDTO;
import com.pinhobrunodev.customtablepk.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> insert (@RequestBody ProductDTO dto){
        return ResponseEntity.ok().body(productService.insert(dto));
    }
}
