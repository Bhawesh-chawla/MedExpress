package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Bed;
import com.cts.service.BedServiceImpl;



@CrossOrigin
@RestController
@RequestMapping("/bed")
public class BedController {
	
	@Autowired
	public BedServiceImpl bedServiceImpl;
	
	@GetMapping("/getAll")
	public List<Bed> getList(){
		return bedServiceImpl.getAllBeds();
	}
	
	@GetMapping("/get/{bedType}")
	public Bed getBed(@PathVariable String bedType) {
		return bedServiceImpl.getBedByBedType(bedType);
	}

	@PutMapping("/update/{bedType}/{count}")
	public void update(@PathVariable String bedType,@PathVariable int count) {
		bedServiceImpl.updateCount(bedType, count);
	}
}
