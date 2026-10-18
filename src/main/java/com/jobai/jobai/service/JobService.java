package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Job;
import com.jobai.jobai.repository.JobRepository;

@Service
public class JobService {

	public final JobRepository jobRepository;

	public JobService(JobRepository jobRepository) {
		super();
		this.jobRepository = jobRepository;
	}
	
	public List<Job> getAllJobs()
	{
		return jobRepository.findAll();
	}
}
