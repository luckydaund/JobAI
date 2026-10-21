package com.jobai.jobai.service;

import com.jobai.jobai.controller.CandidateController;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Interview;
import com.jobai.jobai.repository.InterviewRepository;

@Service
public class InterviewService {

	
	public final InterviewRepository interviewRepository;

	public InterviewService(InterviewRepository interviewRepository) {
		super();
		this.interviewRepository = interviewRepository;
	}
	
	public List<Interview> getData()
	{
		return interviewRepository.findAll();
	}
}
