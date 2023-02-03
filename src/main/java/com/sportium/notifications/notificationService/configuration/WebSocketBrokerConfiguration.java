package com.sportium.notifications.notificationService.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketBrokerConfiguration implements WebSocketMessageBrokerConfigurer {
  @Override
  public void configureMessageBroker(MessageBrokerRegistry config) {
    // user destination prefix is /all
    config.enableSimpleBroker("/all");
    // config.setApplicationDestinationPrefixes("/app");

  }

  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    // registry.addEndpoint("/ws").setAllowedOrigins("*");
    registry.addEndpoint("/ws").setAllowedOriginPatterns("*").withSockJS();
  }
}
