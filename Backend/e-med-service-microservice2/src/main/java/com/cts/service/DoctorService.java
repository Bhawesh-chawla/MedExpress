package com.cts.service;

import java.util.List;

import com.cts.model.Doctor;


public interface DoctorService {
	public void updateAvailability(int id,String val);
	public List<Doctor> getAllDoctors();
	public Doctor getDoctorById(int doctor_id);

}
