package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.JobSkill;
import com.jobai.jobai.repository.JobSkillRepository;

@Service
public class JobSkillService {

	public final JobSkillRepository jobSkillRepository;

	
	
	public JobSkillService(JobSkillRepository jobSkillRepository) {
		super();
		this.jobSkillRepository = jobSkillRepository;
	}



	public List<JobSkill> getAllJobSkill()
	{
		return jobSkillRepository.findAll();
	}
}
