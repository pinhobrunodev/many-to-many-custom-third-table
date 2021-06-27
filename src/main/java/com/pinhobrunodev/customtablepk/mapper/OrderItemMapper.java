package com.pinhobrunodev.customtablepk.mapper;

import com.pinhobrunodev.customtablepk.dtos.OrderItem.OrderItemDTO;
import com.pinhobrunodev.customtablepk.model.OrderItem;
import com.pinhobrunodev.customtablepk.model.Product;
import com.pinhobrunodev.customtablepk.repositories.OrderRepository;
import com.pinhobrunodev.customtablepk.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapper {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;

    public OrderItem toEntity(OrderItemDTO dto) {
        OrderItem orderItem = new OrderItem();
        orderItem.getId().setOrder((orderRepository.getOne(dto.getOrder_id())));
        orderItem.getId().setProduct(productRepository.getOne(dto.getProduct_id()));
        orderItem.setQuantity(dto.getQuantity());
        Product x = productRepository.getOne(dto.getProduct_id());
        orderItem.setPrice(x.getPrice());
        return orderItem;
    }
}
