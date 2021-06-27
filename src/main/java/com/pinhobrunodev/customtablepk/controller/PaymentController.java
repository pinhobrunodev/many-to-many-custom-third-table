package com.pinhobrunodev.customtablepk.controller;

import com.pinhobrunodev.customtablepk.dtos.Payment.PaymentDTO;
import com.pinhobrunodev.customtablepk.services.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {
    

    @Autowired
    private PaymentService paymentService;
    
    @PostMapping
    public ResponseEntity<PaymentDTO> insert (@RequestBody PaymentDTO dto){
        return ResponseEntity.ok().body(paymentService.insert(dto)); //TODO
        
    }
}
