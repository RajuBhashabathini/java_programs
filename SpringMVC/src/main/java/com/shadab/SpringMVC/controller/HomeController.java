package com.shadab.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello From Home Controller";
	}

	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	@GetMapping("/register")
	public String getRegisterPage() {
		return "register";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	

}