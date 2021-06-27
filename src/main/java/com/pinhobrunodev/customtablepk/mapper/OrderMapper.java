package com.pinhobrunodev.customtablepk.mapper;

import java.time.Instant;

import com.pinhobrunodev.customtablepk.dtos.Order.OrderDTO;
import com.pinhobrunodev.customtablepk.model.Order;
import com.pinhobrunodev.customtablepk.model.enums.OrderStatus;
import com.pinhobrunodev.customtablepk.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    @Autowired
    private UserRepository userRepository;

    public Order toEntity(OrderDTO dto) {
        Order entity = new Order();
        entity.setId(dto.getId());
        entity.setMoment(Instant.now());
        entity.setStatus(OrderStatus.WAITING_PAYMENT);
        entity.setUser(userRepository.getOne(dto.getUser_id())); // TODO
        return entity;
    }
}
