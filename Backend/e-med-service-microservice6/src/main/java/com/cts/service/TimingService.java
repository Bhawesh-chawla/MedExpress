package com.cts.service;

import java.util.List;

import com.cts.model.Timing;

public interface TimingService {
	public Timing getTime(int timing_id);
	public Timing saveTiming(Timing timing);
	public List<Timing> getAllTiming();
		
	
}
