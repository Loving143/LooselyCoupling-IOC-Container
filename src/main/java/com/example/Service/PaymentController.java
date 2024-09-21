package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviceImpl.PaymentProcessor;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentProcessor paymentProcessor;
	
	@GetMapping("/payment")
	public String createPayment() {
		return paymentProcessor.processPayment();
		
	}

}
