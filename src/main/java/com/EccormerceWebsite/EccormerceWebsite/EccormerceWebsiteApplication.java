package com.EccormerceWebsite.EccormerceWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.EccormerceWebsite.EccormerceWebsite.controller","com.EccormerceWebsite.EccormerceWebsite.services"})
public class EccormerceWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EccormerceWebsiteApplication.class, args);
	}

}
