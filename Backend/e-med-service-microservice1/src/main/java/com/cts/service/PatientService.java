package com.cts.service;

import java.util.List;

import com.cts.model.Patient;

public interface PatientService {
	
	public Patient savePatient(Patient patient);
	public List<Patient> getAllPatient();
	public Patient getPatientByEmail(String email);
	public boolean checkByEmail(String email);
}
