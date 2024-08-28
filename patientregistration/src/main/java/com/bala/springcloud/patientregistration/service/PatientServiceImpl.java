package com.bala.springcloud.patientregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.springcloud.patientregistration.entities.Patient;
import com.bala.springcloud.patientregistration.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
	
	
@Autowired
private PatientRepository patientRepository;

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public void deletePatient(Patient patient) {
		patientRepository.delete(patient);

	}

	

	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	

	@Override
	public Patient findById(int id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id).get();
	}

}
