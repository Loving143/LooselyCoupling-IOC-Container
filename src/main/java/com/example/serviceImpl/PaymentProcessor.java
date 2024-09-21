package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.Service.PaymentMethod;
@Service
public class PaymentProcessor {
	
	@Autowired
    @Qualifier("creditcardpayment")

	public PaymentMethod paymentMethod;


    public String processPayment() {
      return   paymentMethod.pay();
    }


}
