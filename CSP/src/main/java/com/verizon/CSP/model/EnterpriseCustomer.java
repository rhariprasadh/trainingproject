package com.verizon.CSP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EnterpriseCustomer {
	
	@Id
	
	private int entcust_id;
	
	private String entcust_name;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders orders;
	
	public EnterpriseCustomer() {
		super();

	}

	public int getEntcust_id() {
		return entcust_id;
	}

	public void setEntcust_id(int entcust_id) {
		this.entcust_id = entcust_id;
	}

	public String getEntcust_name() {
		return entcust_name;
	}

	public void setEntcust_name(String entcust_name) {
		this.entcust_name = entcust_name;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	
	

}
