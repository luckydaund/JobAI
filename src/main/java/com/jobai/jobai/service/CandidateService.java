package com.jobai.jobai.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Candidate;
import com.jobai.jobai.repository.CandidateRepository;

@Service
public class CandidateService {

   private final CandidateRepository candidate;

   public CandidateService(CandidateRepository candidate) {
	super();
	this.candidate = candidate;
   }
   
   public List<Candidate> getAllCandidates()
   {
	  return candidate.findAll();  
   }
}
