package com.bala.springcloud.patientregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.springcloud.patientregistration.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
