package com.cts.service;

import java.util.List;

import com.cts.model.Appointment;


public interface AppointmentService {
	public Appointment saveAppointment(Appointment appointment,int doctor_id);
	public boolean existsAppointmentByEmail(String email);
	
	public void deleteService();
	
	public List<Appointment> getAllAppointments();
	public long getCountTiming(int timing_id,int doctor_id);
}
