package com.br.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.br.hrpayroll.entites.Payment;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {

        return new Payment("Bob", 202.00, days);
    }
}
