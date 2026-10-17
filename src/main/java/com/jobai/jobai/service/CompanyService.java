package com.jobai.jobai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Company;
import com.jobai.jobai.repository.CompanyRepository;

@Service
public class CompanyService {

	public final CompanyRepository company;

	public CompanyService(CompanyRepository company) {
		super();
		this.company = company;
	}
	
	
	public Company saveCompany(Company com)
	{
		return company.save(com);
	}
	
	public List<Company> getAllCompanies()
	{
		return company.findAll();
	}
	
	public Optional<Company> getCompanyById(Integer id)
	{
		return company.findById(id);
	}
	
	public void deleteCompany(Integer id)
	{
	 company.deleteById(id);
	}
}
