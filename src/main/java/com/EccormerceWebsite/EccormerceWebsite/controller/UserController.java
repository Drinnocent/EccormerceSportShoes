package com.EccormerceWebsite.EccormerceWebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.EccormerceWebsite.EccormerceWebsite.model.User;
import com.EccormerceWebsite.EccormerceWebsite.services.UserServiceLocal;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceLocal userServiceLocal;
	
@RequestMapping("/orderByBrand")
public ModelAndView orderBrand() {
	List<User> users=userServiceLocal.findAllByOrderByBrand();
	System.out.println("hooray");
	System.out.println(users);
	ModelAndView mv=new ModelAndView();
		mv.setViewName("showUsers");
		mv.addObject("userslist",users);
		return mv;
	}
@RequestMapping("/orderByDate")
public ModelAndView orderbyDate() {
	List<User> users=userServiceLocal.findAllByOrderByBuyingDate();
	ModelAndView mv=new ModelAndView();
		mv.setViewName("showUsers");
		mv.addObject("userslist",users);
		return mv;
	}
@RequestMapping("/deleteUser")
public ModelAndView deleteProduct(@RequestParam int id) {
	userServiceLocal.deleteById(id);
	List<User> users = userServiceLocal.findAll();
	ModelAndView mv = new ModelAndView();
	mv.setViewName("showUsers");
	mv.addObject("userslist",users);
	return mv;
}
@RequestMapping("/searchUser")
public ModelAndView searchUser(@RequestParam String firstName) {
	List<User> users=userServiceLocal.findByFirstName(firstName);
	ModelAndView mv=new ModelAndView();
		mv.setViewName("showUsers");
		mv.addObject("userslist",users);
		return mv;
	}

}
