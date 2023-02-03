package com.sportium.notifications.notificationService.configuration;

import com.sportium.notifications.notificationService.services.NotificationService;
import com.sportium.notifications.notificationService.services.NotificationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;

@Configuration
public class ServiceConfiguration {

  @Bean
  public NotificationService notificationService(SimpMessagingTemplate simpMessagingTemplate) {
    return new NotificationServiceImpl(simpMessagingTemplate);
  }
}
