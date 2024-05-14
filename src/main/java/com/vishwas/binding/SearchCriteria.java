package com.vishwas.binding;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class SearchCriteria {
	// These are the fields which are available in UI
	// to map the data this class is created only for form data mapping
	 
	private String planName;
	
	private String planStatus;
	
	private String gender;
	
	
	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public String getPlanStatus() {
		return planStatus;
	}


	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public LocalDate getPlanstartDate() {
		return planstartDate;
	}


	public void setPlanstartDate(LocalDate planstartDate) {
		this.planstartDate = planstartDate;
	}


	public LocalDate getPlanendDate() {
		return planendDate;
	}


	public void setPlanendDate(LocalDate planendDate) {
		this.planendDate = planendDate;
	}

@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate planstartDate;
	
@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private LocalDate planendDate;
	
	
	

}
