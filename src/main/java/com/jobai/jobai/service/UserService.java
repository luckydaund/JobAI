package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.entity.User;
import com.jobai.jobai.repository.UserRepository;

@Service
public class UserService {

	 private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
}
