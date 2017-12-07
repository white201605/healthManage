package com.aoyang.health.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class IndexController extends BaseController {

	@Value("#{propertiesFactory['sys.name']}")
	private String sysName;
	
	@RequestMapping("")
	public ModelAndView index(ModelAndView model) {
		model.addObject("sysName", sysName);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("login")
	public String login(String name, String password) {
		System.out.println("loading...");
		return "redirect:/admin/homePage";
	}
	
	@RequestMapping("homePage")
	public String homePage() {
		
		return "admin/home";
	}
}
