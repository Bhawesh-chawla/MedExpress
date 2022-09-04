package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Blood;
import com.cts.service.BloodServiceImpl;



@CrossOrigin
@RestController
@RequestMapping("/blood")
public class BloodController {
	
	@Autowired
	BloodServiceImpl bloodServiceImpl;
	
	@RequestMapping("/getAll")
	public List<Blood> getAllBlood(){
		return bloodServiceImpl.getAllBlood();
	}
	
	@PutMapping("/update/{bloodType}/{count}")
	public void update(@PathVariable String bloodType , @PathVariable int count) {
		bloodServiceImpl.updateCount(bloodType, count);
	}

}
