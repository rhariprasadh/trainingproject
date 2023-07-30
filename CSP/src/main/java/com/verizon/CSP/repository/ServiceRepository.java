package com.verizon.CSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.CSP.model.ServiceModel;


@Repository
public interface ServiceRepository extends JpaRepository<ServiceModel,Integer> {

}
