package com.pinhobrunodev.customtablepk.repositories;

import com.pinhobrunodev.customtablepk.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long>{
    
}
