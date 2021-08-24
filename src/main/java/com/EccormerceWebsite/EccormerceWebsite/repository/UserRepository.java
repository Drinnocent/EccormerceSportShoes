package com.EccormerceWebsite.EccormerceWebsite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EccormerceWebsite.EccormerceWebsite.model.Adminstrator;
import com.EccormerceWebsite.EccormerceWebsite.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	List<User> findByOrderByBrand();
	List<User> findAllByOrderByBuyingDate();
	List<User> findByFirstName(String firstName);
}
