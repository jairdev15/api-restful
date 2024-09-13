package com.rest.service;

import java.util.List;
import java.util.Optional;

import com.rest.entity.UserEntity;

public interface UserService {

	List<UserEntity> getAllUsers();
    Optional<UserEntity> getUserById(Long id);
    UserEntity createUser(UserEntity user);
    Optional<UserEntity> updateUser(Long id, UserEntity userDetails);
    void deleteUser(Long id);
    
}
