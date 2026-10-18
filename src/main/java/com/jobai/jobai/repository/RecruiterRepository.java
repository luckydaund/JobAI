package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobai.jobai.entity.Recruiter;
@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Integer>{

}
