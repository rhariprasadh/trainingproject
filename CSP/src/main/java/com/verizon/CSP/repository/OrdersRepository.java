package com.verizon.CSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.CSP.model.Orders;

@Repository

public interface OrdersRepository extends JpaRepository<Orders,Integer> {

}
