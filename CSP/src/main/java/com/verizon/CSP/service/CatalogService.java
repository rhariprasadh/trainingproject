package com.verizon.CSP.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.CSP.model.Catalog;
import com.verizon.CSP.repository.CatalogRepository;



@Service
public class CatalogService{
	
	
	private final CatalogRepository ctlrepo;
	
	@Autowired
	public CatalogService (CatalogRepository ctlrepo) {
		this.ctlrepo = ctlrepo;
		
	}
	public List<Catalog> getAllPlan() {
		return ctlrepo.findAll();
	}
	
	public Catalog getPlanById(Integer plan_id) {
		return ctlrepo.findById(plan_id).orElse(null);
	}
	
	public Catalog createPlan(Catalog ctl) {
		return ctlrepo.save(ctl);
	}
	public Catalog updatePlan(Integer id, Catalog ctl) {
		Catalog existingPlan = ctlrepo.findById(id).orElse(null);
		if(existingPlan != null) {
			existingPlan.setPlan(ctl.getPlan());
			existingPlan.setDescription(ctl.getDescription());
			existingPlan.setPrice(ctl.getPrice());
			existingPlan.setDuration(ctl.getDuration());
			return ctlrepo.save(existingPlan);
		}
		return null;
	}
	
	public void deletePlan(Integer id)
	{
		ctlrepo.deleteById(id);
	}
	
}

