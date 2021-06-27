package com.pinhobrunodev.customtablepk.controller;

import java.util.List;

import com.pinhobrunodev.customtablepk.dtos.Order.OrderDTO;
import com.pinhobrunodev.customtablepk.dtos.Order.ShowOrderInfoDTO;
import com.pinhobrunodev.customtablepk.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    

    @Autowired
    private OrderService orderService;
    
    @PostMapping
    public ResponseEntity<OrderDTO> insert (@RequestBody OrderDTO dto){
        return ResponseEntity.ok().body(orderService.insert(dto)); // TODO
    }
    @GetMapping
    public ResponseEntity<List<ShowOrderInfoDTO>> findAll(){
        return ResponseEntity.ok().body(orderService.findAll());
    }
}
