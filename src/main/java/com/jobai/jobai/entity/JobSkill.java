package com.jobai.jobai.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_skills")
public class JobSkill {

	@EmbeddedId
	private JobSkillId id;

	@ManyToOne
	@MapsId("jobId")
	@JoinColumn(name = "job_id")
	private Job job;

	@ManyToOne
	@MapsId("skillId")
	@JoinColumn(name = "skill_id")
	private Skill skill;

	public JobSkill() {
		super();
	}

	public JobSkillId getId() {
		return id;
	}

	public void setId(JobSkillId id) {
		this.id = id;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

}
