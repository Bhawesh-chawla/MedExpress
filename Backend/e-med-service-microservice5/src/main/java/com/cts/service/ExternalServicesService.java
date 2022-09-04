package com.cts.service;

import java.util.List;

import com.cts.model.ExternalServices;



public interface ExternalServicesService {
	
	public ExternalServices saveExternalServices(ExternalServices service);
	public List<ExternalServices> getAllExternalServices();
	public ExternalServices getExternalServicesById(int id);
	public boolean CheckByServiceId(int id);
	public void DeleteServiceById(int id);
	public void updateExternalServices(int id,boolean avail);

}
