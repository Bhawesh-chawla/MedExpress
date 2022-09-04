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
@Table(name="blood")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bloodId")
	private int bloodId;
	
	@Column(name="bloodType" , unique=true)
	private String bloodType;
	
	@Column(name="bloodCount")
	private int bloodCount;
}
