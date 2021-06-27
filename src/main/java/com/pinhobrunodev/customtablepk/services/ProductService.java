package com.pinhobrunodev.customtablepk.services;

import javax.transaction.Transactional;

import com.pinhobrunodev.customtablepk.dtos.Product.ProductDTO;
import com.pinhobrunodev.customtablepk.mapper.ProductMapper;
import com.pinhobrunodev.customtablepk.model.Product;
import com.pinhobrunodev.customtablepk.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;


    @Transactional
    public ProductDTO insert(ProductDTO dto){
        Product entity = productMapper.toEntity(dto);
        productRepository.save(entity);
        return new ProductDTO(entity);
    }
}
