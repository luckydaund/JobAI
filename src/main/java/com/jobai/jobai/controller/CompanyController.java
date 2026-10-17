package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Company;
import com.jobai.jobai.service.CompanyService;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

	private final CompanyService service;

	public CompanyController(CompanyService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<Company> saveCompany(@RequestBody Company company)
	{
		Company saveCompany = service.saveCompany(company);
		return ResponseEntity.ok(saveCompany);
	}
	
	@GetMapping
	public ResponseEntity<List<Company>> getAllComanies()
	{
	   return ResponseEntity.ok(service.getAllCompanies());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Company> getCompanyById(@PathVariable Integer id)
	{
		return service.getCompanyById(id)
				.map(ResponseEntity::ok)
				.orElseGet(()-> ResponseEntity.notFound().build());
	}
	
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCompany(
	            @PathVariable Integer id) {

	        if (service.getCompanyById(id).isEmpty()) {
	            return ResponseEntity.notFound().build();
	        }

	        service.deleteCompany(id);

	        return ResponseEntity.noContent().build();
	    }
	
}
