package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Blood;


@Repository
public interface BloodRepository extends JpaRepository<Blood, Integer>{
	public Blood findByBloodType(String bloodType);
}
