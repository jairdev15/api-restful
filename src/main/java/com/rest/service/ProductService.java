package com.rest.service;

import java.util.List;
import java.util.Optional;

import com.rest.entity.Product;

public interface ProductService {

	List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product createProduct(Product product);
    Optional<Product> updateProduct(Long id, Product productDetails);
    void deleteProduct(Long id);
    
}
