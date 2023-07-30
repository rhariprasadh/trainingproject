package com.verizon.CSP.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.verizon.CSP.model.EnterpriseCustomer;

import com.verizon.CSP.repository.EnterpriseCustomerRepository;





@Service

public class EnterpriseCustomerService {



private final EnterpriseCustomerRepository entcustrepo;



	@Autowired

	public EnterpriseCustomerService(EnterpriseCustomerRepository encustrepo)



	{
	this.entcustrepo = encustrepo;



	}

	public List<EnterpriseCustomer> getAllEnterpriseCustomer() {
		
		return entcustrepo.findAll();

	}

	

	public EnterpriseCustomer getEnCustById(Integer entcust_id) {

		return entcustrepo.findById(entcust_id).orElse(null);

	}

	public EnterpriseCustomer createEnterpriseCustomer(EnterpriseCustomer entcust)

	{

		return entcustrepo.save(entcust);

		}

	public EnterpriseCustomer updateEnterpriseCustomer(Integer id,EnterpriseCustomer entcust) {



		EnterpriseCustomer existingEntCustomer = entcustrepo.findById(id).orElse(null);



		if (existingEntCustomer != null) {

			existingEntCustomer.setEntcust_id(entcust.getEntcust_id());

			existingEntCustomer.setEntcust_name(entcust.getEntcust_name());

			existingEntCustomer.setOrders(entcust.getOrders());

			return entcustrepo.save(existingEntCustomer);

		}

		return null;



	}

		}




