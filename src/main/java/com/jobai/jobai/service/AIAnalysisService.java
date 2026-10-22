package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.AIAnalysis;
import com.jobai.jobai.repository.AIAnalysisRepository;

@Service
public class AIAnalysisService {

	public final AIAnalysisRepository aiAnalysisRepository;

	public AIAnalysisService(AIAnalysisRepository aiAnalysisRepository) {
		super();
		this.aiAnalysisRepository = aiAnalysisRepository;
	}
	
	public List<AIAnalysis> getData()
	{
		return aiAnalysisRepository.findAll();
	}
} 
