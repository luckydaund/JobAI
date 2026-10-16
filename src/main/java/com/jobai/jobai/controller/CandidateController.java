package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Candidate;
import com.jobai.jobai.service.CandidateService;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

	private final CandidateService service;

	public CandidateController(CandidateService service) {
		super();
		this.service = service;
	}
	@GetMapping
	public List<Candidate> getAllCandidates(){
		return service.getAllCandidates();
	}
}
