package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.serviceImpl.PaymentProcessor;

@SpringBootApplication
public class LooselyCouplingApplication {

	@Autowired
	static PaymentProcessor paymentProcessor;
	
	public static void main(String[] args) {
		SpringApplication.run(LooselyCouplingApplication.class, args);
	}

}
