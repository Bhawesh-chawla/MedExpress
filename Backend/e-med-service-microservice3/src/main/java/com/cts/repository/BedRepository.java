package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Bed;


@Repository
public interface BedRepository extends JpaRepository<Bed, Integer>{
	public Bed findByBedType(String bedType);

}
