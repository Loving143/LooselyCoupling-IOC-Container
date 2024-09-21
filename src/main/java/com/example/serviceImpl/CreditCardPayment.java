package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.Service.PaymentMethod;

@Service
@Qualifier("creditcardpayment")
public class CreditCardPayment implements PaymentMethod{

	@Override
	public String pay() {
		return "Payment done using Credit Card.";
	}

	
}
