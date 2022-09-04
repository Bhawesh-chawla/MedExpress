package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Timing;
import com.cts.repository.TimingRepository;

@Service
public class TimingServiceImpl implements TimingService{

	@Autowired
	TimingRepository timingRepository;
	
	@Override
	public Timing getTime(int timing_id) {
		// TODO Auto-generated method stub
		return timingRepository.findByTimingid(timing_id);
	}

	@Override
	public Timing saveTiming(Timing timing) {
		return timingRepository.save(timing);
	}

	@Override
	public List<Timing> getAllTiming() {
		// TODO Auto-generated method stub
		return timingRepository.findAll();
	}

}
