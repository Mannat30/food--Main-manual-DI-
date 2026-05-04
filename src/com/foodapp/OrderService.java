package com.foodapp;

public class OrderService {
	private PaymentService payment;
	private NotificationService notification;
	public OrderService(PaymentService payment,NotificationService notification) {
		this.payment=payment;
		this.notification=notification;
	}
	public void placeorder() {
		System.out.print("order placed");
	

	payment.pay();
	
	notification.sendNotification();
	}
	

}
