package com.vishwas.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
@Entity

@NoArgsConstructor
public class CitizenPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	
	private String name;
	
	private String email;
	
	private Long phno;
	
	private Long ssn;
	
	 private String gender;
	 
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String planName;
	
	
	
	
	// Parameterized constructor
	

	public Integer getCitizenId() {
		return citizenId;
	}

	public CitizenPlan(String name, String email, Long phno, Long ssn, String gender, String planName,
			String planStatus, LocalDate planStartDate, LocalDate planEnddateDate) {
		super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.ssn = ssn;
		this.gender = gender;
		this.planName = planName;
		this.planStatus = planStatus;
		this.planStartDate = planStartDate;
		this.planEnddateDate = planEnddateDate;
	}

	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

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

	public LocalDate getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}

	public LocalDate getPlanEnddateDate() {
		return planEnddateDate;
	}

	public void setPlanEnddateDate(LocalDate planEnddateDate) {
		this.planEnddateDate = planEnddateDate;
	}

	private String planStatus;
	
	private  LocalDate planStartDate;
	
	private LocalDate planEnddateDate;
	
		
	

}
