package com.verizon.CSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.verizon.CSP.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}

