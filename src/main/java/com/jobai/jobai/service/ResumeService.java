package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Resume;
import com.jobai.jobai.repository.ResumeRepository;

@Service
public class ResumeService {

	public final ResumeRepository repository;

	public ResumeService(ResumeRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Resume> getData()
	{
		return repository.findAll();
	}
}
