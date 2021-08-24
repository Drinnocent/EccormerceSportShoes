package com.EccormerceWebsite.EccormerceWebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EccormerceWebsite.EccormerceWebsite.model.User;
import com.EccormerceWebsite.EccormerceWebsite.repository.UserRepository;

@Service
public class UserService implements UserServiceLocal {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findAll() {
	       return userRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		
		userRepository.deleteById(id);
	}
	public List<User> findAllByOrderByBrand()
	{
		return userRepository.findByOrderByBrand();
	}
	public List<User> findAllByOrderByBuyingDate()
	{
		return userRepository.findAllByOrderByBuyingDate();
	}
	public List<User> findByFirstName(String firstName)
	{
		return userRepository.findByFirstName(firstName);
	}

}
