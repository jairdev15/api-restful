package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
