package com.sportium.notifications.notificationService.controllers;

import com.sportium.notifications.notificationService.repositories.entities.NotificationBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {
    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/application")
    @SendTo("/all/group-notification")
    public Object notify(String title, String text) {
        return new NotificationBO(title, text);
    }
}
