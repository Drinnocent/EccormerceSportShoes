package com.EccormerceWebsite.EccormerceWebsite.services;

import java.util.List;

import com.EccormerceWebsite.EccormerceWebsite.model.Adminstrator;

public interface AdminServiceLocal {
	public List<Adminstrator> findByFirstName(String name);
	public Adminstrator login(String username,String password);
	public Adminstrator findById(int id);
	public void save(Adminstrator admin);
	public Adminstrator findByUsername(String username);

}
