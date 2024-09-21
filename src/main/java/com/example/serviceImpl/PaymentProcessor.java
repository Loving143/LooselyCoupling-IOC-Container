package com.example.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.Service.PaymentMethod;
@Service
public class PaymentProcessor {
	
	private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) { // Constructor injection
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        paymentMethod.pay();
    }


}
