package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Interview;
import com.jobai.jobai.service.InterviewService;

@RestController
@RequestMapping("/api/interviews")
public class InterviewController {

	public final InterviewService interviewService;

	public InterviewController(InterviewService interviewService) {
		super();
		this.interviewService = interviewService;
	}
	
	@GetMapping
	public List<Interview> getInterviews()
	{
		return interviewService.getData();
	}
}
