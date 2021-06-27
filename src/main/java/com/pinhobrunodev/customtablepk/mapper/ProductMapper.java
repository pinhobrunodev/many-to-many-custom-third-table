package com.pinhobrunodev.customtablepk.mapper;

import com.pinhobrunodev.customtablepk.dtos.Category.CategoryDTO;
import com.pinhobrunodev.customtablepk.dtos.Product.ProductDTO;
import com.pinhobrunodev.customtablepk.model.Category;
import com.pinhobrunodev.customtablepk.model.Product;
import com.pinhobrunodev.customtablepk.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public Product toEntity(ProductDTO dto){
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setImgUrl(dto.getImgUrl());
        product.setPrice(dto.getPrice());
        for(CategoryDTO x : dto.getCategories()){
            Category aux = categoryRepository.getOne(x.getId());
            product.getCategories().add(aux);
        }
        return product;
    }
}
