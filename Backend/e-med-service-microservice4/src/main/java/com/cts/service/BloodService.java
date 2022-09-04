package com.cts.service;

import java.util.List;

import com.cts.model.Blood;


public interface BloodService {
	public Blood getBloodByBloodType(String bloodType);
	public void updateCount(String bloodType,int count);
	public List<Blood> getAllBlood();
}
