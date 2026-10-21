package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.SavedJob;
import com.jobai.jobai.repository.SavedJobRepository;

@Service
public class SavedJobService {

	public final SavedJobRepository jobRepository;

	public SavedJobService(SavedJobRepository jobRepository) {
		super();
		this.jobRepository = jobRepository;
	}
	
	public List<SavedJob> getData()
	{
		return jobRepository.findAll();
	}
	
}
