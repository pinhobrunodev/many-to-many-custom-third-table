package com.pinhobrunodev.customtablepk.mapper;

import java.time.Instant;

import com.pinhobrunodev.customtablepk.dtos.Payment.PaymentDTO;
import com.pinhobrunodev.customtablepk.model.Payment;
import com.pinhobrunodev.customtablepk.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    @Autowired
    private OrderRepository orderRepository;

    public Payment toEntity(PaymentDTO dto) {
        Payment entity = new Payment();
        entity.setId(dto.getId());
        entity.setMoment(Instant.now());
        entity.setOrder(orderRepository.getOne(dto.getOrder_id()));
        return entity;
    }

}
