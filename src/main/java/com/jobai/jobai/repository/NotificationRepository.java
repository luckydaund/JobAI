package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobai.jobai.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification,Integer> {

}
