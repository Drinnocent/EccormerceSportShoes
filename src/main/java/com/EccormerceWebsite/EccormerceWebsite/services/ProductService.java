package com.EccormerceWebsite.EccormerceWebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EccormerceWebsite.EccormerceWebsite.model.Products;
import com.EccormerceWebsite.EccormerceWebsite.repository.ProductRepository;

@Service
public class ProductService implements ProductServiceLocal {

	@Autowired
	private ProductRepository productRepository;
	@Override
	public Products save(Products prod) {
	        return productRepository.save(prod);
		
	}

	@Override
	public Products findById(int id) {
		
		return productRepository.findById(id).get();
	}

	@Override
	public List<Products> findAll() {
	
		return productRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		productRepository.deleteById(id);
		
	}

}
