package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hellocontroller {

	@RequestMapping("/sayhello")
	public ModelAndView sayHello() {
		
		String message = "Welcome to spring mvc";
		
		return new ModelAndView("hello","data",message);
	}
}
