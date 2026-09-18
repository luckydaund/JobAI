package com.jobai.jobai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobai.jobai.entity.Role;
import com.jobai.jobai.service.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
	
   private final RoleService roleService;

   public RoleController(RoleService roleService) {
	super();
	this.roleService = roleService;
   }
   
   public List<Role> getAllRoles()
   {
	  return roleService.getAllRoles();
   }

}
