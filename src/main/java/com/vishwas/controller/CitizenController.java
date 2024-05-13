package com.vishwas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vishwas.service.CitizenPlanService;

@Controller
public class CitizenController {
	
	@Autowired
private CitizenPlanService service;	
	
	@GetMapping("/")
	public String indexModel(Model model) {
		
		return "index";
	}
	

}
