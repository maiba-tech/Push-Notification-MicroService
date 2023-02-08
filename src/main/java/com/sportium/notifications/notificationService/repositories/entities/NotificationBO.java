package com.sportium.notifications.notificationService.repositories.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notification")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NotificationBO {
  @GeneratedValue(generator = "UUID")
  @Id
  //@NotNull
  private UUID id;

  //@NotNull
  private String title;

  //@NotNull
  private String description;

  //@NotNull
  private boolean seen;

  //@NotNull
   private LocalDateTime createdOn;

  @ManyToOne
  @JoinColumn(name = "notification_type_id", nullable = false)
  // @NotNull
  private NotificationTypeBO notificationTypeBO;

  @ManyToOne
  @JoinColumn(name = "notification_color_identifier_id", nullable = false)
  // @NotNull
  private NotificationColorIdentifierBO notificationColorIdentifierBO;

  public NotificationBO(UUID id) {
    this.id = id;
  }

  public NotificationBO(String title, String description
      // NotificationTypeBO notificationTypeBO,
      // NotificationColorIdentifierBO notificationColorIdentifierBO
      ) {
    this.seen = false;
    this.createdOn = LocalDateTime.now();
    this.title = title;
    this.description = description;
    //  this.notificationTypeBO = notificationTypeBO;
    // this.notificationColorIdentifierBO = notificationColorIdentifierBO;
  }
}
