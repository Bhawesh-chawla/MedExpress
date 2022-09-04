package com.cts.model;

import java.time.LocalDateTime;

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

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="appointment1")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointment_id;
	
	@Column(name = "email")
	private String email; 
	
	@Column(name="patientid")
	private int patientid;
	
	@Column(name = "doctorid")
	private int doctorid;
	
	@Column(name="timings")
	private LocalDateTime timings;
	
	@Column(name = "timingid")
	private int timingid;

	
}