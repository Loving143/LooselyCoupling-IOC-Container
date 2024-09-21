package com.example.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.Service.PaymentMethod;
@Service
public class CreditCardPayment implements PaymentMethod{

	@Override
	public void pay() {
		System.out.println("This is the Standard Form of the Application.");
	}

	
}
