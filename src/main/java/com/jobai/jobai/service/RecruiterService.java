package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Recruiter;
import com.jobai.jobai.repository.RecruiterRepository;

@Service
public class RecruiterService {

	public final RecruiterRepository recruiter;
	
	public RecruiterService(RecruiterRepository recruiter) {
		super();
		this.recruiter = recruiter;
	}


	public List<Recruiter> getAllRecruters()
	{
		return recruiter.findAll();
	}
}
