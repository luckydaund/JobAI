package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobai.jobai.entity.Company;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{
	

}
