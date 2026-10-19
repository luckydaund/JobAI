package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Skill;
import com.jobai.jobai.service.SkillService;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

	public final SkillService service;

	public SkillController(SkillService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public List<Skill> getAllSkills()
	{
		return service.getAll();
	}
}
