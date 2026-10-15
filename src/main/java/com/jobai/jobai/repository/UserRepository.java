package com.jobai.jobai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobai.jobai.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
