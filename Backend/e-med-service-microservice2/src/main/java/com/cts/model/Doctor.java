package com.cts.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private int doctor_id;
	@Column(nullable=false)
	private String doctor_name;
	@Column(nullable=false)
	private String specialization;
	@Column(nullable=false)
	private String gender;

	@Column(name="doctor_email_id",unique = true,nullable=false)
	private String doctor_email_id;
	@Column(nullable=false)
	private int appointment_count;
	@Column(nullable=false)
	private String about;

	private String availability;
	@Column(nullable=false)
	private String doctor_phone_no;
	 
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDoctor_email_id() {
		return doctor_email_id;
	}

	public void setDoctor_email_id(String doctor_email_id) {
		this.doctor_email_id = doctor_email_id;
	}

	public int getAppointment_count() {
		return appointment_count;
	}

	public void setAppointment_count(int appointment_count) {
		this.appointment_count = appointment_count;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getDoctor_phone_no() {
		return doctor_phone_no;
	}

	public void setDoctor_phone_no(String doctor_phone_no) {
		this.doctor_phone_no = doctor_phone_no;
	}
}
	