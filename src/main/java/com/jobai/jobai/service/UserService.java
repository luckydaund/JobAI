package com.jobai.jobai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobai.jobai.dto.UserResponseDTO;
import com.jobai.jobai.entity.User;
import com.jobai.jobai.repository.UserRepository;

@Service
public class UserService {

	 private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<UserResponseDTO> getAllUsers() {
	        List<User> users =  userRepository.findAll();
	        
	         return users.stream()
	        		 .map(user -> new UserResponseDTO(
	        				 user.getUserId(),
	        				 user.getName(),
	        				 user.getEmail(),
	        				 user.getPhone(),
	        				 user.getStatus(),
	        				 user.getRole().getRoleName()))
	        		 .toList();
	    }
}
