package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Timing;
import com.cts.service.TimingService;

@RestController
@CrossOrigin
@RequestMapping("/timing")
public class TimingController {
	@Autowired
	public TimingService timingService;
	
	@GetMapping("/{timing_id}")
	public Timing getTimeCon(@PathVariable int timing_id) {
		return timingService.getTime(timing_id);
	}
	@PostMapping("/add/{timing_id}")
	public String addTime(@RequestBody Timing timing, @PathVariable int timing_id)
	{
		timingService.saveTiming(timing);
		return "timing added successfully";
	}
	
	@GetMapping("/getAllTiming")
	public List<Timing> getAllTime(){
		return timingService.getAllTiming();
	}
}
