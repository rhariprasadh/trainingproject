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

import com.verizon.CSP.model.Catalog;
import com.verizon.CSP.service.CatalogService;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {
	
	private final CatalogService ctlservice;
	
	@Autowired
	public CatalogController (CatalogService ctlservice) {
		this.ctlservice=ctlservice;
	}
	
	@RequestMapping("/allplan")
	public List<Catalog> getAllPlan() {
		return ctlservice.getAllPlan();
	}
	
	@PostMapping("/createplan")
	public Catalog createPlan(@RequestBody Catalog ctl) {
		return ctlservice.createPlan(ctl);
	}
	
	@GetMapping("/{id}")
	public Catalog getPlanById(@PathVariable Integer id) {
		return ctlservice.getPlanById(id);
	}
	
	@PostMapping("/{id}")
	public Catalog updatePlan(@PathVariable Integer id, @RequestBody Catalog ctl) {
		return ctlservice.updatePlan(id, ctl);
	}
	
	@DeleteMapping("/{id}")
	public void deletePlan(@PathVariable Integer id) {
		ctlservice.deletePlan(id);
	}

}

