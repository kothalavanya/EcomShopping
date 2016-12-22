package com.niit.ecomshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homePage() {
		System.out.println("Executing the method homePage");
		return "home";
	}
	@RequestMapping("/login")
	public ModelAndView showLoginPage()
	{
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("msg","You clicked login link");
		mv.addObject("showLoginPage", "true");
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView showRegistrationPage()
	{
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("msg", "You clicked registration link");
		mv.addObject("showRegistrationPage","true");
		return mv;
	}
}
