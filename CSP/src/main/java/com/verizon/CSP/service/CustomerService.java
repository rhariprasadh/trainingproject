package com.verizon.CSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.CSP.model.Customer;
import com.verizon.CSP.repository.CustomerRepository;

@Service
public class CustomerService {

private final CustomerRepository custrepo;

	@Autowired
	public CustomerService(CustomerRepository custrepo)
	{
		this.custrepo = custrepo;
	}

	public List<Customer> getAllCustomers() {
		return custrepo.findAll();
	}

	public Customer getCustomerById(Integer id) {
		return custrepo.findById(id).orElse(null);
	}

	public Customer createCustomer(Customer customer)
	{
		return custrepo.save(customer);
	}
	
	public Customer updateCustomer(Integer id,Customer customer) {
		Customer existingCustomer = custrepo.findById(id).orElse(null);
		if (existingCustomer != null) {
			existingCustomer.setCustomer_id(customer.getCustomer_id());
			existingCustomer.setCustomer_name(customer.getCustomer_name());
			existingCustomer.setOrders(customer.getOrders());
		
			return custrepo.save(existingCustomer);
		}
		return null;
	}

	public void deleteCustomer(Integer id) 
	{
		custrepo.deleteById(id);
	}

}


