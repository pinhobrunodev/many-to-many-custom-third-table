package com.pinhobrunodev.customtablepk.repositories;

import com.pinhobrunodev.customtablepk.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
    
}
