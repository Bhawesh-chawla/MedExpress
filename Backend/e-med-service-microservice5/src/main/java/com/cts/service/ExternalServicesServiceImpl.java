package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.ExternalServices;
import com.cts.repository.ExternalServicesRepository;


@Service
public class ExternalServicesServiceImpl implements ExternalServicesService{
	
	@Autowired
	ExternalServicesRepository externalServicesRepository;

	@Override
	public ExternalServices saveExternalServices(ExternalServices service) {
		return externalServicesRepository.save(service);
	}

	@Override
	public List<ExternalServices> getAllExternalServices() {
		// TODO Auto-generated method stub
		return externalServicesRepository.findAll();
	}

	@Override
	public ExternalServices getExternalServicesById(int id) {
		// TODO Auto-generated method stub
		return externalServicesRepository.findByServiceId(id);
	}

	@Override
	public boolean CheckByServiceId(int id) {
		// TODO Auto-generated method stub
		return externalServicesRepository.existsByServiceId(id);
	}

	@Override
	public void DeleteServiceById(int id) {
		externalServicesRepository.deleteById(id);
	}

	@Override
	public void updateExternalServices(int id, boolean avail) {

		ExternalServices externalServices = externalServicesRepository.findByServiceId(id);
		externalServices.setAvailable(avail);
		externalServicesRepository.save(externalServices);
		
	}
	
}
