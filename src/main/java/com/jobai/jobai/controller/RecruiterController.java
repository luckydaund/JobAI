package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Recruiter;
import com.jobai.jobai.service.RecruiterService;

@RestController
@RequestMapping("/api/recruiter")
public class RecruiterController {

	public final RecruiterService recruiterService;

	public RecruiterController(RecruiterService recruiterService) {
		super();
		this.recruiterService = recruiterService;
	}
	
	@GetMapping
	public List<Recruiter> getAllRecruiter()
	{
		return recruiterService.getAllRecruters();
	}
}
