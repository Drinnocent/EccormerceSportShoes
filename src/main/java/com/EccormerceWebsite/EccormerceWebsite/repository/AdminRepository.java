package com.EccormerceWebsite.EccormerceWebsite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.EccormerceWebsite.EccormerceWebsite.model.Adminstrator;

@Repository
public interface AdminRepository extends JpaRepository<Adminstrator,Integer> {
	
	  @Query("select u from Adminstrator u where u.username = :username and u.password = :password"
	  ) public Adminstrator login(@Param("username")String
	  username, @Param("password")String password);
	 
	List<Adminstrator> findByFirstName(String firstName);
	Adminstrator findByUsername(String username);
	
}