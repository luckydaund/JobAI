package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Notification;
import com.jobai.jobai.repository.NotificationRepository;

@Service
public class NotificationService {

	public final NotificationRepository notificationRepository;

	public NotificationService(NotificationRepository notificationRepository) {
		super();
		this.notificationRepository = notificationRepository;
	}
	
	public List<Notification> getData()
	{
		return notificationRepository.findAll();
	}
}
