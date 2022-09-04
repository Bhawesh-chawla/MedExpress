package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.ExternalServices;


public interface ExternalServicesRepository extends JpaRepository<ExternalServices, Integer> {

	public ExternalServices findByServiceId(int id);
	public boolean existsByServiceId(int id);

}
