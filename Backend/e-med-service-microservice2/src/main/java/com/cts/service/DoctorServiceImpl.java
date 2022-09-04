package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Doctor;
import com.cts.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository doctorRepository;
	@Override
	public void updateAvailability(int id,String val) {
		
		doctorRepository.updateAvailability(id,val);
	}
	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}
	@Override
	public Doctor getDoctorById(int doctor_id) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctor_id);
	}

}