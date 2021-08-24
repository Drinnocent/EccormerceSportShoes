package com.EccormerceWebsite.EccormerceWebsite.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.EccormerceWebsite.EccormerceWebsite.model.Products;
import com.EccormerceWebsite.EccormerceWebsite.model.User;
import com.EccormerceWebsite.EccormerceWebsite.services.ProductServiceLocal;
import com.EccormerceWebsite.EccormerceWebsite.services.UserServiceLocal;

@Controller
public class ProductController {

	@Autowired
	private ProductServiceLocal productService;

	@Autowired
	private UserServiceLocal userServiceLocal;

	@RequestMapping("/addProductForm")
	public String showCreateContactPage(Model model) {
		model.addAttribute("command", new Products());
		return "new_products";
	}

	@RequestMapping("/newProduct")
	public ModelAndView createProduct(@ModelAttribute("contact") Products product) {
		productService.save(product);
		List<Products> prodlist = productService.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("products");
		mv.addObject("prodlist", prodlist);
		return mv;
	}

	@RequestMapping("/updateProduct")
	public ModelAndView updateProduct(@RequestParam int id, @RequestParam String price) {
		Products p = productService.findById(id);
		p.setPrice(price);
		List<Products> prodlist = productService.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("products");
		mv.addObject("prodlist", prodlist);
		return mv;
	}

	@RequestMapping("/deleteProduct")
	public ModelAndView deleteProduct(@RequestParam int id) {
		productService.deleteById(id);
		List<Products> prodlist = productService.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("products");
		mv.addObject("prodlist", prodlist);
		return mv;
	}

	@RequestMapping("/showUsers")
	public ModelAndView getUsers() {
		List<User> users = userServiceLocal.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showUsers");
		mv.addObject("userslist", users);
		return mv;
	}

}

