package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobai.jobai.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Integer> {

}
