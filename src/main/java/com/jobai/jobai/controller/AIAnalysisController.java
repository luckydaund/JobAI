package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.AIAnalysis;
import com.jobai.jobai.service.AIAnalysisService;

@RestController
@RequestMapping("/api/ai-analysis")
public class AIAnalysisController {

	private final AIAnalysisService aiAnalysisService;

	public AIAnalysisController(AIAnalysisService aiAnalysisService) {
		super();
		this.aiAnalysisService = aiAnalysisService;
	}
	
	@GetMapping
	public List<AIAnalysis> getAIAnalysisData()
	{
		return aiAnalysisService.getData();
	}
}
