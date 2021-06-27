package com.pinhobrunodev.customtablepk.mapper;

import com.pinhobrunodev.customtablepk.dtos.Category.CategoryDTO;
import com.pinhobrunodev.customtablepk.model.Category;

import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    

    public Category toEntity(CategoryDTO dto){
        Category entity = new Category();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
