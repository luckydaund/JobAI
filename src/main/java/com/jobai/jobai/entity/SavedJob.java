package com.jobai.jobai.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="saved_jobs")
public class SavedJob {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="saved_job_id")
	 private Integer savedJobId;
	
	@ManyToOne
	@JoinColumn(name="candidate_id",nullable = false)
	 private Candidate candidate;
	
	@ManyToOne
	@JoinColumn(name="job_id",nullable = false)
	  private Job job;
	
	@Column(name = "saved_at")
	 private LocalDateTime savedAt;

	public SavedJob() {
		super();
	}

	public Integer getSavedJobId() {
		return savedJobId;
	}

	public void setSavedJobId(Integer savedJobId) {
		this.savedJobId = savedJobId;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public LocalDateTime getSavedAt() {
		return savedAt;
	}

	public void setSavedAt(LocalDateTime savedAt) {
		this.savedAt = savedAt;
	}
	
	 
}
