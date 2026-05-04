package com.foodapp;

public class SmsNotification implements NotificationService {
	@Override
	public void sendNotification() {
		System.out.println("send notify by sms");
	}

}
