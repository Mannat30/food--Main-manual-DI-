package com.foodapp;

public class CardPayment implements PaymentService {
	
	@Override
	public void pay() {
		System.out.println("payment done using card");
	}

}
