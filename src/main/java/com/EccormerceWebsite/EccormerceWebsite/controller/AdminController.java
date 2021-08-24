package com.EccormerceWebsite.EccormerceWebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.EccormerceWebsite.EccormerceWebsite.model.Adminstrator;
import com.EccormerceWebsite.EccormerceWebsite.model.Products;
import com.EccormerceWebsite.EccormerceWebsite.services.AdminServiceLocal;
import com.EccormerceWebsite.EccormerceWebsite.services.ProductServiceLocal;

@Controller
public class AdminController {
	@Autowired
	private AdminServiceLocal adminService;
	@Autowired 
	ProductServiceLocal productService;
	
	@RequestMapping("/")
	public String homepage() 
	{
		return "login";
	}
	@RequestMapping("/dologin")
	public ModelAndView dologin(@RequestParam String username,@RequestParam String password) 
	{
		List<Products> prodlist=productService.findAll();
		ModelAndView mv=new ModelAndView();
		Adminstrator admin=adminService.login(username, password);
		if(admin!=null) 
		{
			System.out.println("we in");
			mv.setViewName("products");
			mv.addObject("prodlist",prodlist);
			
			return mv;
		}
		else 
		{
			mv.setViewName("login");
			return mv;
		}
	}
	@RequestMapping("/showchangePassword")
	public String showCreateContactPage(Model model) {
		model.addAttribute("command", new Adminstrator());
		return "changePassword";
	}
	@RequestMapping("/changepassword")
	public void changePassword(@RequestParam String username,@RequestParam String newpassword) 
	{
		Adminstrator admin=adminService.findByUsername(username);
		if(admin!=null) 
		{
			admin.setPassword(newpassword);
			adminService.save(admin);
			
		}
		
	}
}
