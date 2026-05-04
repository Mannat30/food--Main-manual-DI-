package com.foodapp;

public class EmailService implements NotificationService {
	@Override
	public void sendNotification() {
		System.out.println("Email send");
	}

}
