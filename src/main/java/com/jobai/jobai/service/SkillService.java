package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Skill;
import com.jobai.jobai.repository.SkillRepository;

@Service
public class SkillService {

	public final SkillRepository repository;

	public SkillService(SkillRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Skill> getAll()
	{
		return repository.findAll();
	}
}
