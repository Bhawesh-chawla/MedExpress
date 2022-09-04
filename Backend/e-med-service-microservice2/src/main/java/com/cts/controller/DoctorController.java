package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Doctor;
import com.cts.service.DoctorService;



@RestController
@CrossOrigin
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping(value="/update/{id}/{val}" )
	public String updateAvailability(@PathVariable int id,@PathVariable String val) 
	{
		System.out.println(id+" "+val);
		doctorService.updateAvailability(id,val);
		return "Updated value";
	}
	
	
	@GetMapping("/getAllDoctors")
	public List<Doctor> getAllDoctors()
	{
		return doctorService.getAllDoctors();
	}
	
	@GetMapping("/getdoc/{doctor_id}")
	public Doctor getDoctorById(@PathVariable int doctor_id){
		return doctorService.getDoctorById(doctor_id);
	}
		

}
