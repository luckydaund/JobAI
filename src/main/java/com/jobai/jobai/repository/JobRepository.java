package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobai.jobai.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{

}
