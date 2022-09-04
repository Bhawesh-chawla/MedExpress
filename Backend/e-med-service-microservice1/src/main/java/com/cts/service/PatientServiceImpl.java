package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Patient;
import com.cts.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	public Patient getPatientByEmail(String email)
	{
		return patientRepository.findByEmail(email);
	}

	@Override
	public boolean checkByEmail(String email) {
		// TODO Auto-generated method stub
		return patientRepository.existsByEmail(email);
	}


}
