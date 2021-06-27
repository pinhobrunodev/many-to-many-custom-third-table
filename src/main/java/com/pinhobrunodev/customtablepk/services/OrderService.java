package com.pinhobrunodev.customtablepk.services;

import java.util.List;
import java.util.stream.Collectors;

import com.pinhobrunodev.customtablepk.dtos.Order.OrderDTO;
import com.pinhobrunodev.customtablepk.dtos.Order.ShowOrderInfoDTO;
import com.pinhobrunodev.customtablepk.mapper.OrderMapper;
import com.pinhobrunodev.customtablepk.model.Order;
import com.pinhobrunodev.customtablepk.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    @Autowired
    private OrderMapper mapper;

    @Transactional
    public OrderDTO insert(OrderDTO dto){
        Order entity = mapper.toEntity(dto); // TODO
        repository.save(entity);
        return new OrderDTO(entity);
    }

    @Transactional(readOnly = true)
    public List<ShowOrderInfoDTO> findAll(){
        return repository.findAll().stream().map(ShowOrderInfoDTO::new).collect(Collectors.toList());
    }
}
