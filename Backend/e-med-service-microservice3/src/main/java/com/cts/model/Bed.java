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
@Table(name="bed")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bedId")
	int bedId;
	
	@Column(name="bedType",unique=true)
	String bedType;
	
	@Column(name = "bedCount")
	int bedCount = 0;
	
}
