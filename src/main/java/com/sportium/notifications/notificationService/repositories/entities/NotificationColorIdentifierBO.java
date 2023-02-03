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
@Table(name = "notification_color_identifier")
@NoArgsConstructor
@AllArgsConstructor
public class NotificationColorIdentifierBO {
  @GeneratedValue(generator = "UUID")
  @Id
  @NotNull
  private UUID id;

  @NotNull private String color;
}
