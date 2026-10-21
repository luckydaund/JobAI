package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobai.jobai.entity.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {

}
