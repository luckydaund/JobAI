package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.JobSkill;
import com.jobai.jobai.service.JobSkillService;

@RestController
@RequestMapping("/api/job-skills")
public class JobSkillController {

	private final JobSkillService jobSkillService;

	public JobSkillController(JobSkillService jobSkillService) {
		super();
		this.jobSkillService = jobSkillService;
	}
	
	@GetMapping
	public List<JobSkill> getAllJobSkills()
	{
		return jobSkillService.getAllJobSkill();
	}
}
