package com.example.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.Service.PaymentMethod;

@Service
public class PayPal implements PaymentMethod{

	@Override
	public void pay() {
		System.out.println("This payment will be done using Paypal");
	}
}
