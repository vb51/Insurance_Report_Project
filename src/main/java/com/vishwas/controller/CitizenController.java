package com.vishwas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vishwas.binding.SearchCriteria;
import com.vishwas.service.CitizenPlanService;

@Controller
public class CitizenController {
	
	@Autowired
private CitizenPlanService service;	
	
	@GetMapping("/")
	public String indexModel(Model model) {
		 List<String> planNames = service.getPlanNames();
		 
		 List<String> planStatus= service.getPlanStatus();
		 
		 model.addAttribute("planNames",planNames);
	
		 model.addAttribute("planStatus",planStatus);
		 
		 model.addAttribute("search",new SearchCriteria());
		return "index";
	}
	
	@PostMapping("/filter-data")
	public String handleSearchbtn(@ModelAttribute("search") SearchCriteria criteria, Model model)
	{
		System.out.println(criteria);		
		List<String> planNames = service.getPlanNames();
		 
		 List<String> planStatus= service.getPlanStatus();
		 
		 model.addAttribute("planNames",planNames);
	
		 model.addAttribute("planStatus",planStatus);
		 
		return "index";
			
	}
	
	

}
