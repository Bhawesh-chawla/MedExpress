package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Bed;
import com.cts.repository.BedRepository;


@Service
public class BedServiceImpl implements BedService{
	
	@Autowired
	BedRepository bedRepository;

	@Override
	public Bed getBedByBedType(String bedType) {
		return bedRepository.findByBedType(bedType);
	}

	@Override
	public void updateCount(String bedType,int count) {
		Bed bed = bedRepository.findByBedType(bedType);
		bed.setBedCount(count);
		bedRepository.save(bed);
		
	}

	@Override
	public List<Bed> getAllBeds() {
		return bedRepository.findAll();
	}

}
