package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobai.jobai.entity.SavedJob;

public interface SavedJobRepository extends JpaRepository<SavedJob, Integer> {

}
