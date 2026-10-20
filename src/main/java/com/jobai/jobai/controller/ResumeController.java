package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Resume;
import com.jobai.jobai.service.ResumeService;

@RestController
@RequestMapping("/api/resumes")
public class ResumeController {

	public final ResumeService resumeService;

	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	@GetMapping
	public List<Resume> getAllResumes()
	{
		return resumeService.getData();
	}
}
