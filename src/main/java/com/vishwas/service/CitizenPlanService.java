package com.vishwas.service;

import java.util.List;

import com.vishwas.binding.SearchCriteria;
import com.vishwas.entity.CitizenPlan;

import jakarta.servlet.http.HttpServletResponse;

public interface CitizenPlanService {

	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List <CitizenPlan> Searchcitizen(SearchCriteria sc);
	
	public void generateExcel(HttpServletResponse response);
	
	public void generatePdf(HttpServletResponse response);
	
	
	
}
