package com.vishwas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishwas.entity.CitizenPlan;

public interface Citizenplanrepo extends JpaRepository<CitizenPlan, Integer> {

}
