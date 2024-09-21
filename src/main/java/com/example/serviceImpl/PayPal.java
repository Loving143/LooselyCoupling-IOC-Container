package com.example.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.Service.PaymentMethod;

@Service
public class PayPal implements PaymentMethod{

	@Override
	public String pay() {
		return "Payment done using Paypal";
	}
}
