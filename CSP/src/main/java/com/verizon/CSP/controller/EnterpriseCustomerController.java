package com.verizon.CSP.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;



import org.springframework.web.bind.annotation.PostMapping;



import org.springframework.web.bind.annotation.RequestBody;



import org.springframework.web.bind.annotation.RequestMapping;



import org.springframework.web.bind.annotation.RestController;



import com.verizon.CSP.model.EnterpriseCustomer;

import com.verizon.CSP.service.EnterpriseCustomerService;





@RestController

@RequestMapping("/api/entcustomer")

public class EnterpriseCustomerController {

private final EnterpriseCustomerService entcustservice;



	@Autowired

	public EnterpriseCustomerController(EnterpriseCustomerService entcustservice)

	{

		this.entcustservice=entcustservice;

	}



	@RequestMapping("/allentcustomer")

	public List<EnterpriseCustomer> getAllEnterpriseCustomer() {

		return entcustservice.getAllEnterpriseCustomer();

	}



	@PostMapping("/createentcust")

	public EnterpriseCustomer createEnterpriseCustomer(@RequestBody EnterpriseCustomer entcust)

	{

		return entcustservice.createEnterpriseCustomer(entcust);

	}

	

	@GetMapping("/{id}")

	public EnterpriseCustomer getEnCustById(@PathVariable Integer id) {

		return entcustservice.getEnCustById(id);

	}



	@PostMapping("/{id}")

	public EnterpriseCustomer updateEnterpriseCustomer(@PathVariable Integer id, @RequestBody EnterpriseCustomer entcust)

	{

		return entcustservice.updateEnterpriseCustomer(id, entcust);

	}

	

}

