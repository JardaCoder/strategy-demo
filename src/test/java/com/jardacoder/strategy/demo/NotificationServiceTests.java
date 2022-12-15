package com.jardacoder.strategy.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jardacoder.strategy.demo.enums.NotificationType;
import com.jardacoder.strategy.demo.interfaces.factory.NotificationServiceFactory;

@SpringBootTest
class NotificationServiceTests {

	
	@Autowired
	private NotificationServiceFactory notificationServiceFactory;

	@Test
	public void sendNotificationTest() {
		sendNotification(NotificationType.EMAIL);
	}

	
	private void sendNotification(NotificationType notificationType) {
		notificationServiceFactory.findStrategy(notificationType).sendNotification();
	}
}
