package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Application;
import com.jobai.jobai.service.ApplicationService;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

	public final ApplicationService applicationService;

	public ApplicationController(ApplicationService applicationService) {
		super();
		this.applicationService = applicationService;
	}
	
	@GetMapping
	public List<Application> getApplicationsData()
	{
		return applicationService.getApplications();
	}
}
