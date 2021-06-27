package com.pinhobrunodev.customtablepk.services;

import com.pinhobrunodev.customtablepk.dtos.Payment.PaymentDTO;
import com.pinhobrunodev.customtablepk.mapper.PaymentMapper;
import com.pinhobrunodev.customtablepk.model.Payment;
import com.pinhobrunodev.customtablepk.repositories.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService {
    


    @Autowired
    private PaymentRepository repository;
    @Autowired
    private PaymentMapper mapper;
    @Transactional
    public PaymentDTO insert(PaymentDTO dto){
        Payment entity = mapper.toEntity(dto); // TODO
        repository.save(entity);
        return new PaymentDTO(entity);
    }
}
