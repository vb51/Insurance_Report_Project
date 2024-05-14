package com.vishwas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwas.binding.SearchCriteria;
import com.vishwas.entity.CitizenPlan;
import com.vishwas.repo.Citizenplanrepo;

import jakarta.servlet.http.HttpServletResponse;


@Service
public class CitizenPlanServiceImpl implements CitizenPlanService {

	
	@Autowired
	private Citizenplanrepo repo;
	
	@Override
	public List<String> getPlanNames() {
		return repo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		return repo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> Searchcitizen(SearchCriteria sc) {
	
		return null;
	}

	@Override
	public void generateExcel(HttpServletResponse response) {
	

	}

	@Override
	public void generatePdf(HttpServletResponse response) {
		

	}

}
