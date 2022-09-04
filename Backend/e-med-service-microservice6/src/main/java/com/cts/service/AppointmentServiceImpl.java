package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Appointment;
import com.cts.repository.AppointmentRepository;



@Service
public class AppointmentServiceImpl implements AppointmentService{
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public Appointment saveAppointment(Appointment appointment,int doctor_id) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}
	@Override
	public boolean existsAppointmentByEmail(String email) {
		return appointmentRepository.existsByEmail(email);
	}
	@Override
	public void deleteService() {
		appointmentRepository.deleteAll();
	}
	@Override
	public List<Appointment> getAllAppointments() {
		
		return  appointmentRepository.findAll();
	}
	@Override
	public long getCountTiming(int timing_id, int doctor_id) {
		// TODO Auto-generated method stub
		List<Appointment> ls = appointmentRepository.findByDoctoridAndTimingid(doctor_id, timing_id);
		
		return ls.size();
	}
	


	
}
