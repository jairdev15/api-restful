package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.UserEntity;
import com.rest.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<UserEntity> getUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public UserEntity createUser(UserEntity user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<UserEntity> updateUser(Long id, UserEntity userDetails) {
		return userRepository.findById(id)
	            .map(user -> {
	                user.setName(userDetails.getName());
	                user.setEmail(userDetails.getEmail());
	                return userRepository.save(user);
	            });
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);		
	}

}
