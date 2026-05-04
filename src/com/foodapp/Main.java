package com.foodapp;

public class Main {
	public static void main(String[]args) {
		PaymentService payment =new CardPayment();
		NotificationService notification=new SmsNotification();
		OrderService order=new OrderService(payment,notification);
		order.placeorder();
		}

}
