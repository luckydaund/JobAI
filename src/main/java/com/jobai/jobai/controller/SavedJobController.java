package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.SavedJob;
import com.jobai.jobai.service.SavedJobService;

@RestController 
@RequestMapping("/api/saved-jobs")
public class SavedJobController {

	public final SavedJobService jobService;

	public SavedJobController(SavedJobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping
	public List<SavedJob> getAllSavedJobs()
	{
		return jobService.getData();
	}
}
