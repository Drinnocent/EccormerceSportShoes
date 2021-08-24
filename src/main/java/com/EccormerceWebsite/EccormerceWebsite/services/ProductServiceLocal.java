package com.EccormerceWebsite.EccormerceWebsite.services;

import java.util.List;

import com.EccormerceWebsite.EccormerceWebsite.model.Products;

public interface ProductServiceLocal {
	public Products save(Products prod);
	public Products findById(int prod);
	public List<Products> findAll();
	public void deleteById(int id);
	
	
	

}
