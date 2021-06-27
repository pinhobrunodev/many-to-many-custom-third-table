package com.pinhobrunodev.customtablepk.services;

import com.pinhobrunodev.customtablepk.dtos.Category.CategoryDTO;
import com.pinhobrunodev.customtablepk.mapper.CategoryMapper;
import com.pinhobrunodev.customtablepk.model.Category;
import com.pinhobrunodev.customtablepk.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService {
    

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    @Transactional
    public CategoryDTO insert(CategoryDTO dto){
        Category aux = categoryMapper.toEntity(dto);
        categoryRepository.save(aux);
        return new CategoryDTO(aux);
    }
}
