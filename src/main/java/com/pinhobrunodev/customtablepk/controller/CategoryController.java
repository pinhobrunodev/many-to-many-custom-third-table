package com.pinhobrunodev.customtablepk.controller;

import com.pinhobrunodev.customtablepk.dtos.Category.CategoryDTO;
import com.pinhobrunodev.customtablepk.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    
    @Autowired
    private CategoryService service;


    @PostMapping
    public ResponseEntity<CategoryDTO> insert (@RequestBody CategoryDTO dto){
        return ResponseEntity.ok().body(service.insert(dto));
    }
    
}
