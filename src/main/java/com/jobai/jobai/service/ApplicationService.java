package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Application;
import com.jobai.jobai.repository.ApplicationRepository;

@Service
public class ApplicationService {

	public final ApplicationRepository applicationRepository;

	public ApplicationService(ApplicationRepository applicationRepository) {
		super();
		this.applicationRepository = applicationRepository;
	}
	
	public List<Application> getApplications()
	{
		return applicationRepository.findAll();
	}
}
