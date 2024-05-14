package com.vishwas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vishwas.entity.CitizenPlan;

public interface Citizenplanrepo extends JpaRepository<CitizenPlan, Integer> {
  // retrieve data for drop down display
	@Query("select distinct(planName) from CitizenPlan")
	public List<String> getPlanNames();
	
	@Query("select distinct(planStatus) from CitizenPlan")
	public List<String> getPlanStatus();
	
	
}
