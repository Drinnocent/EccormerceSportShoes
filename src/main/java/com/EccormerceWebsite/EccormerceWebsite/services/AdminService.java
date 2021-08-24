package com.EccormerceWebsite.EccormerceWebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EccormerceWebsite.EccormerceWebsite.model.Adminstrator;
import com.EccormerceWebsite.EccormerceWebsite.repository.AdminRepository;

@Service
public class AdminService implements AdminServiceLocal {

	@Autowired
	private AdminRepository adminRepository;
	@Override
	public List<Adminstrator> findByFirstName(String name) {
		
		return adminRepository.findByFirstName(name);
	}

	@Override
	public Adminstrator login(String username, String password) {
		
		return adminRepository.login(username, password);
	}

	@Override
	public Adminstrator findById(int id) {
	
		return adminRepository.getById(id);
	}

	@Override
	public void save(Adminstrator admin) {
		adminRepository.save(admin);
		
	}
	public Adminstrator findByUsername(String username) 
	{
		return adminRepository.findByUsername(username);
	}
	

}
