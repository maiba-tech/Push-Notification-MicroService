package com.sportium.notifications.notificationService.services;

import org.springframework.messaging.simp.SimpMessagingTemplate;

public class NotificationServiceImpl implements NotificationService {

  private final SimpMessagingTemplate simpMessagingTemplate;

  public NotificationServiceImpl(SimpMessagingTemplate simpMessagingTemplate) {
    this.simpMessagingTemplate = simpMessagingTemplate;
  }

  /*public void notify(Object params) {
    simpMessagingTemplate.convertAndSend("/all/group-notification", params);
  }*/
}
