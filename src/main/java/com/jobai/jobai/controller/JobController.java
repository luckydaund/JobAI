package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Job;
import com.jobai.jobai.service.JobService;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	public final JobService jobService;

	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping
	public List<Job> getAllJob()
	{
		return jobService.getAllJobs();
	}
}
