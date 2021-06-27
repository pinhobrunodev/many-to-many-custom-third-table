package com.pinhobrunodev.customtablepk.controller;

import com.pinhobrunodev.customtablepk.dtos.OrderItem.OrderItemDTO;
import com.pinhobrunodev.customtablepk.services.OrderItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @PostMapping
    public ResponseEntity<OrderItemDTO> insert(@RequestBody OrderItemDTO dto) {
        return ResponseEntity.ok().body(orderItemService.insert(dto));
    }
}
