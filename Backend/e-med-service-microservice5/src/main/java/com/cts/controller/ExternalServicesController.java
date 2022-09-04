package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.ExternalServices;
import com.cts.service.ExternalServicesService;

@CrossOrigin
@RestController
@RequestMapping("/services")
public class ExternalServicesController {

	
	@Autowired
	private ExternalServicesService externalServicesService;
	
	@PostMapping("/add")
	public String add(@RequestBody ExternalServices externalServices)
	{
		externalServicesService.saveExternalServices(externalServices);
		return "new Service Added";
	}

	@GetMapping("/getAll")
	public List<ExternalServices> getAllServices(){
		return externalServicesService.getAllExternalServices();
	}
	
	@GetMapping("/get/{id}")
	public ExternalServices getServiceById( @PathVariable int  id)
	{
		if(externalServicesService.CheckByServiceId(id)) {
		return externalServicesService.getExternalServicesById(id);
		}
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean DeleteById(@PathVariable int id)
	{
		if(externalServicesService.CheckByServiceId(id)) {
		externalServicesService.DeleteServiceById(id);
		return true;
		}
		return false;
	}
	
	@PutMapping("/update/{id}/{available}")
	public void UpdateAvailablity(@PathVariable int id ,@PathVariable boolean available) {
		externalServicesService.updateExternalServices(id,available);
	}
}
