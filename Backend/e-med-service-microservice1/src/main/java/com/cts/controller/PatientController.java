package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Patient;
import com.cts.service.PatientService;

@CrossOrigin
@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/add")
	public String add(@RequestBody Patient patient)
	{
		patientService.savePatient(patient);
		return "New Patient Added";
	}
	
	@GetMapping("/getAllPatients")
	public List<Patient> getAllPatients(){
		return patientService.getAllPatient();
	}
	
	@GetMapping("/getpat/{email}")
	public Patient getPatentByEmail(@PathVariable String email){
		return patientService.getPatientByEmail( email);
	}

	@GetMapping("/exists/{email}")
	public boolean GetStatusEmail(@PathVariable String email){
		return patientService.checkByEmail(email);
	}
}
