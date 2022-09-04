package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Timing;

@Repository
public interface TimingRepository extends JpaRepository<Timing, Integer> {
	
	public Timing findByTimingid(int timing_id);
}
