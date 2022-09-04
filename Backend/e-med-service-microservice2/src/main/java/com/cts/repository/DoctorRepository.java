package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.model.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{
	@Modifying
	@Transactional
	@Query(" update Doctor d set d.availability = ?2 where d.doctor_id =?1 ")
	public void updateAvailability(int id,String val);
	
	public Doctor findById(int doctor_id);

}
