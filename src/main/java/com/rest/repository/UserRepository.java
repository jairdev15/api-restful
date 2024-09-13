package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
