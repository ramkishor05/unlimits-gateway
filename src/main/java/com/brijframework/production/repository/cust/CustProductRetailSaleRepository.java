package com.brijframework.production.repository.cust;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustProductRetailSale;

@Repository
@Transactional
public interface CustProductRetailSaleRepository extends JpaRepository<EOCustProductRetailSale, Long>{
	
}
