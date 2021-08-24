package com.EccormerceWebsite.EccormerceWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EccormerceWebsite.EccormerceWebsite.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>{

}
