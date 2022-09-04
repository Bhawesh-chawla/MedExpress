package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Blood;
import com.cts.repository.BloodRepository;

@Service
public class BloodServiceImpl implements BloodService{
	
	@Autowired
	BloodRepository bloodRepository;

	@Override
	public Blood getBloodByBloodType(String bloodType) {
		// TODO Auto-generated method stub
		return bloodRepository.findByBloodType(bloodType) ;
	}

	@Override
	public void updateCount(String bloodType, int count) {
		
		Blood blood = bloodRepository.findByBloodType(bloodType);
		blood.setBloodCount(count);
		bloodRepository.save(blood);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Blood> getAllBlood() {
		// TODO Auto-generated method stub
		return bloodRepository.findAll();
	}

}
