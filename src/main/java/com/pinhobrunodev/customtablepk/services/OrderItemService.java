package com.pinhobrunodev.customtablepk.services;

import com.pinhobrunodev.customtablepk.dtos.OrderItem.OrderItemDTO;
import com.pinhobrunodev.customtablepk.mapper.OrderItemMapper;
import com.pinhobrunodev.customtablepk.model.OrderItem;
import com.pinhobrunodev.customtablepk.repositories.OrderItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
    
    @Autowired
    private OrderItemRepository orderItemRepository;
    @Autowired
    private OrderItemMapper mapper;

    public OrderItemDTO insert(OrderItemDTO dto){
        OrderItem entity = mapper.toEntity(dto);
        orderItemRepository.save(entity);
        return new OrderItemDTO(entity);
    }

    
}
