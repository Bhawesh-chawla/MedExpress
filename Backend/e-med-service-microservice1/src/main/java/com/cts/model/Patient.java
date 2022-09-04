package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="patient")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long patient_id;
	
	@Column(name="patient_name")
	private String patient_name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
	
	@Column(name="age")
	private int age;
	
	private String gender;
	
	@Column(name="patient_email_id",unique = true)
	private String email;
	
	private String patient_phone_no;

	public Patient(String patient_name, String password, String address, int age, String gender,
			String email, String patient_phone_no) {
		super();
		this.patient_name = patient_name;
		this.password = password;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.patient_phone_no = patient_phone_no;
	}
	
	
	
	
	

}
