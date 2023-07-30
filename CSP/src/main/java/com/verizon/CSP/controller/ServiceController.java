package com.verizon.CSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.CSP.model.ServiceModel;
import com.verizon.CSP.service.ServiceModelServicee;



@RestController
@RequestMapping("/api/servicemodel")
public class ServiceController {
	
	private final ServiceModelServicee smservice;
	
	@Autowired
	public ServiceController ( ServiceModelServicee smservice) {
		this.smservice=smservice;
	}
	
	@RequestMapping("/allservice")
	public List<ServiceModel> getAllService() {
		return smservice.getAllService();
	}
	
	@GetMapping("/{id}")
	public ServiceModel getServicerById(@PathVariable Integer id) {
		return smservice.getServiceById(id);
	}
	
	@PostMapping("/createservice")
	public ServiceModel createService(@RequestBody ServiceModel sm) {
		return smservice.createService(sm);
	}
	
	@PostMapping("/{id}")
	public ServiceModel updateService(@PathVariable Integer id, @RequestBody ServiceModel sm) {
		return smservice.updateService(id, sm);
	}
	
}


