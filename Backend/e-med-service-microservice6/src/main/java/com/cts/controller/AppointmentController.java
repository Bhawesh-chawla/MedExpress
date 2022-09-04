package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Appointment;
import com.cts.service.AppointmentService;

@RestController
@CrossOrigin
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	@PostMapping("/add/{doctor_id}")
	public String add(@RequestBody Appointment appointment, @PathVariable int doctor_id)
	{
		System.out.println(appointment);
		appointmentService.saveAppointment(appointment,doctor_id);
		return "New appointment is added";
	}
	@GetMapping("/appointmentExists/{email}")
	public boolean isPresent(@PathVariable String email)
	{
		return appointmentService.existsAppointmentByEmail(email);
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAll()
	{
		appointmentService.deleteService();
	}
	
	@GetMapping("/getAllAppointments")
	public List<Appointment> getAllAppointments()
	{
		return appointmentService.getAllAppointments();
	}
	
	
	@GetMapping("/time/{timing_id}/{doctor_id}")
	public long getCount(@PathVariable int timing_id,@PathVariable int doctor_id )
	{
		return appointmentService.getCountTiming(timing_id, doctor_id);
	}

}

