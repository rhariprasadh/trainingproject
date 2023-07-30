package com.verizon.CSP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceModel {
	
	@Id
	private int service_id;
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Catalog catalog;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders orders;
	
	private String provision;
	private String test_qos;
	private String status;
	
	
	public ServiceModel() {
		super();

	}


	public int getService_id() {
		return service_id;
	}


	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public Orders getOrders() {
		return orders;
	}


	public void setOrders(Orders orders) {
		this.orders = orders;
	}


	public Catalog getCatalog() {
		return catalog;
	}


	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}


	public String getProvision() {
		return provision;
	}


	public void setProvision(String provision) {
		this.provision = provision;
	}


	public String getTest_qos() {
		return test_qos;
	}


	public void setTest_qos(String test_qos) {
		this.test_qos = test_qos;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
}



