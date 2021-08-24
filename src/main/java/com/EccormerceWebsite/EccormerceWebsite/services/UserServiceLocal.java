package com.EccormerceWebsite.EccormerceWebsite.services;

import java.util.List;

import com.EccormerceWebsite.EccormerceWebsite.model.User;

public interface UserServiceLocal {

	public User save(User user);
	public User findById(int prod);
	public List<User> findAll();
	public void deleteById(int id);
	public List<User> findAllByOrderByBrand();
	public List<User> findAllByOrderByBuyingDate();
	List<User> findByFirstName(String firstName);
}
