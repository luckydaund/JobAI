package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.Role;
import com.jobai.jobai.repository.RoleRepository;

@Service
public class RoleService {

	public final RoleRepository repository;

	public RoleService(RoleRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Role> getAllRoles()
	{
		return repository.findAll();
		
	}
}
