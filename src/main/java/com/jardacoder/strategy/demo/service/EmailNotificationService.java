package com.jardacoder.strategy.demo.service;

import org.springframework.stereotype.Service;

import com.jardacoder.strategy.demo.enums.NotificationType;
import com.jardacoder.strategy.demo.interfaces.NotificationService;

@Service
public class EmailNotificationService implements NotificationService{


	@Override
	public NotificationType sendNotification() {
		System.out.println("Sending email notification.....");
		return NotificationType.EMAIL;
	}

	@Override
	public NotificationType getStrategyName() {
		return NotificationType.EMAIL;
	}

}
