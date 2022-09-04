package com.cts.service;

import java.util.List;

import com.cts.model.Bed;


public interface BedService {
	public Bed getBedByBedType(String bedType);
	public void updateCount(String bedType,int count);
	public List<Bed> getAllBeds();
}
