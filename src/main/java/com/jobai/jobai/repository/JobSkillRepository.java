package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobai.jobai.entity.JobSkill;
import com.jobai.jobai.entity.JobSkillId;

public interface JobSkillRepository extends JpaRepository<JobSkill,JobSkillId>{

}
