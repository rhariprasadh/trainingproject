package com.verizon.CSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.CSP.model.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog,Integer> {

}
