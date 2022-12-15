package com.jardacoder.strategy.demo.interfaces;

import com.jardacoder.strategy.demo.enums.NotificationType;

public interface NotificationService extends StrategyBase<NotificationType> {
	
	
	NotificationType sendNotification();

}
