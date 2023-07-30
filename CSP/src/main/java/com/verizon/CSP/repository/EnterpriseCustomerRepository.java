package com.verizon.CSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.CSP.model.EnterpriseCustomer;


@Repository
public interface EnterpriseCustomerRepository extends JpaRepository<EnterpriseCustomer,Integer> {

}

