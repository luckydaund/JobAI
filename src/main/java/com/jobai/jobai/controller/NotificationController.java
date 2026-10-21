package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Notification;
import com.jobai.jobai.service.NotificationService;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

	public final NotificationService notificationService;

	public NotificationController(NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}
	
	@GetMapping
	public List<Notification> getAllNotifications()
	{
		return notificationService.getData();
	}
}
