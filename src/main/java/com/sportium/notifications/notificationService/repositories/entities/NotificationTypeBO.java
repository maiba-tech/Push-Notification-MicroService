package com.sportium.notifications.notificationService.repositories.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "notification_type")
@NoArgsConstructor
@AllArgsConstructor
public class NotificationTypeBO {
  @GeneratedValue(generator = "UUID")
  @Id
  @NotNull
  private UUID id;

  @NotNull private String type;
}
