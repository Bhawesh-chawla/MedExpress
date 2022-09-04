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
@Table(name="externalservices")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExternalServices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="serviceId")
	int serviceId;
	
	@Column(name="serviceName")
	String serviceName;
	
	@Column(name="serviceDesc")
	String serviceDesc;

	@Column(name="phone")
	String phone;
	
	@Column(name="timing")
	String timing;
	
	@Column(name="link")
	String link;
	
	@Column(name="isAvailable")
	boolean isAvailable = true;
}
