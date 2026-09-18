package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobai.jobai.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
