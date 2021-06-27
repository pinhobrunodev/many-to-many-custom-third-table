package com.pinhobrunodev.customtablepk.repositories;

import com.pinhobrunodev.customtablepk.model.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
    
}
