package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="timing1")
public class Timing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int timingid;
	
	@Column(name="appointmenttime")
	private String appointmenttime;
	

}
