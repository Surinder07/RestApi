package com.surinder.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surinder.clinicals.model.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

}
