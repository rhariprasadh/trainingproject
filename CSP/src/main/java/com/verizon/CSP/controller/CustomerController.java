package com.verizon.CSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.verizon.CSP.model.Customer;

import com.verizon.CSP.service.CustomerService;

@RestController

@RequestMapping("/api/customer")

public class CustomerController {

private final CustomerService custservice;

	@Autowired

	public CustomerController(CustomerService custservice)

	{

		this.custservice=custservice;

	}

	@RequestMapping("/allcust")

	public List<Customer> getAllCustomers() {

		return custservice.getAllCustomers();

	}

	@PostMapping("/createcust")

	public Customer createCustomer(@RequestBody Customer cust)

	{

		return custservice.createCustomer(cust);	

	}
	
	@GetMapping("/{id}")
	
	public Customer getCustomerById(@PathVariable Integer id) {
		return custservice.getCustomerById(id);
	}

	@PostMapping("/{id}")

	public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer customer)

	{

		return custservice.updateCustomer(id, customer);

	}

	@DeleteMapping("/{id}")

	public void deleteCustomer(@PathVariable Integer id)

	{

		custservice.deleteCustomer(id);

	}


}



