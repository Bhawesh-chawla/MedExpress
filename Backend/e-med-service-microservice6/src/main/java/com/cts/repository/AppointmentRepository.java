package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cts.model.Appointment;



@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
	public boolean existsByEmail(String email);
	public List<Appointment> findByDoctoridAndTimingid(int doctorid , int timingid);
	
//	@Query("select count(a.patient_id) from appointment1 a where a.timing_id=?1 and a.doctor_id?=?2")
//	long getCountOfTime(int timing_id,int doctor_id);

}
