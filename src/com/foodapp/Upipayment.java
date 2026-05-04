package com.foodapp;

public class Upipayment implements PaymentService {
	@Override
	public void pay() {
		System.out.print("Payment done using UPI");	}

}
