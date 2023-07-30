package com.verizon.CSP.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.verizon.CSP.model.Orders;
import com.verizon.CSP.service.OrdersService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	
private final OrdersService ordservice;

	@Autowired
	public OrdersController(OrdersService ordservice)
	{
		this.ordservice=ordservice;
	}

	@RequestMapping("/allorder")
	public List<Orders> getAllOrders() {
		return ordservice.getAllOrders();
	}

	@PostMapping("/createorder")
	public Orders createOrders(@RequestBody Orders ord)
	{
		return ordservice.createOrders(ord);
	}
	
	@GetMapping("/{id}")
	public Orders getOrderById(@PathVariable Integer id) {
		return ordservice.getOrderById(id);
	}

	@PostMapping("/{id}")
	public Orders updateOrders(@PathVariable Integer id, @RequestBody Orders orders)
	{
		return ordservice.updateOrders(id, orders);

	}

}
