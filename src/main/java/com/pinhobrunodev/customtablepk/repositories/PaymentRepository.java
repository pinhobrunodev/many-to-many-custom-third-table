package com.pinhobrunodev.customtablepk.repositories;

import com.pinhobrunodev.customtablepk.model.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    
}
