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
@Table(name="resumes")
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="resume_id")
	 private Integer resumeId;
	@ManyToOne
	@JoinColumn(name="candidate_id",nullable = false)
	private Candidate candidate;
	 @Column(name = "resume_name")
	    private String resumeName;

	    @Column(name = "file_url")
	    private String fileUrl;

	    @Column(name = "is_primary")
	    private Boolean isPrimary;

	    @Column(name = "created_at")
	    private LocalDateTime createdAt;

	    @Column(name = "updated_at")
	    private LocalDateTime updatedAt;

		public Resume() {
			super();
		}

		public Integer getResumeId() {
			return resumeId;
		}

		public void setResumeId(Integer resumeId) {
			this.resumeId = resumeId;
		}

		public Candidate getCandidate() {
			return candidate;
		}

		public void setCandidate(Candidate candidate) {
			this.candidate = candidate;
		}

		public String getResumeName() {
			return resumeName;
		}

		public void setResumeName(String resumeName) {
			this.resumeName = resumeName;
		}

		public String getFileUrl() {
			return fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

		public Boolean getIsPrimary() {
			return isPrimary;
		}

		public void setIsPrimary(Boolean isPrimary) {
			this.isPrimary = isPrimary;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
}
