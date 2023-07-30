package com.verizon.CSP.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.CSP.model.Orders;
import com.verizon.CSP.repository.OrdersRepository;

@Service
public class OrdersService {
	
private final OrdersRepository ordrepo;

	@Autowired
	public OrdersService(OrdersRepository ordrepo)
	{
		this.ordrepo = ordrepo;
	}

	public List<Orders> getAllOrders() {
		return ordrepo.findAll();
	}
	
	public Orders getOrderById(Integer order_id) {
		return ordrepo.findById(order_id).orElse(null);
		
	}
	
	public Orders createOrders(Orders orders)
	{
		return ordrepo.save(orders);
		}
	
	public Orders updateOrders(Integer id,Orders orders) {
		Orders existingOrders = ordrepo.findById(id).orElse(null);
		if (existingOrders != null) {
			existingOrders.setOrder_id(orders.getOrder_id());
			existingOrders.setCatalog(orders.getCatalog());
			return ordrepo.save(existingOrders);
		}
		return null;
	}
	
}

