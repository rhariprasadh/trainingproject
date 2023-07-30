package com.verizon.CSP.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.CSP.model.ServiceModel;
import com.verizon.CSP.repository.ServiceRepository;

@Service
public class ServiceModelServicee{
	
	
	private final ServiceRepository srvrepo;
	
	@Autowired
	public ServiceModelServicee (ServiceRepository srvrepo) {
		this.srvrepo = srvrepo;
		
	}
	public List<ServiceModel> getAllService() {
		return srvrepo.findAll();
	}
	
	public ServiceModel getServiceById(Integer service_id) {
		return srvrepo.findById(service_id).orElse(null);
	}
	
	public ServiceModel createService(ServiceModel sm) {
		return srvrepo.save(sm);
	}
	public ServiceModel updateService(Integer id, ServiceModel sm) {
		ServiceModel existingSv = srvrepo.findById(id).orElse(null);
		if(existingSv != null) {
			existingSv.setService_id(sm.getService_id());
			existingSv.setCatalog(sm.getCatalog());
			existingSv.setOrders(sm.getOrders());
			existingSv.setProvision(sm.getProvision());
			existingSv.setTest_qos(sm.getTest_qos());
			return srvrepo.save(existingSv);
		}
		return null;
	}
	
	
}



