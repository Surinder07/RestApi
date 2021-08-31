package com.surinder.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surinder.clinicals.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
