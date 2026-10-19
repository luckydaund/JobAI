package com.jobai.jobai.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;


@Embeddable
public class JobSkillId implements Serializable{

	private Integer jobId;
    private Integer skillId;
	public JobSkillId() {
		super();
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}
    
}
