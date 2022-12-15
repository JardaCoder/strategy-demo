package com.jardacoder.strategy.demo.interfaces.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.jardacoder.strategy.demo.enums.NotificationType;
import com.jardacoder.strategy.demo.interfaces.NotificationService;

@Component
public class NotificationServiceFactory {
	
	
	private Map<NotificationType, NotificationService> strategies = new HashMap<NotificationType, NotificationService>();
	
	
	public NotificationServiceFactory(Set<NotificationService> strategySet) {
		createStrategy(strategySet);
	}
	
	public NotificationService findStrategy(NotificationType notificationType) {
		return strategies.get(notificationType);
	}
	
	
	private void createStrategy(Set<NotificationService> strategySet) {
		strategySet.forEach(strategy -> strategies.put(strategy.getStrategyName(), strategy));
	}

}
