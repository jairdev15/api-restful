package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Product;
import com.rest.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> updateProduct(Long id, Product productDetails) {
		return productRepository.findById(id)
	            .map(product -> {
	                product.setName(productDetails.getName());
	                product.setPrice(productDetails.getPrice());
	                return productRepository.save(product);
	            });
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

}
