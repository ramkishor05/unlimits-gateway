package com.brijframework.production.repository.cust;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustProductWholeSale;

@Repository
@Transactional
public interface CustProductWholeSaleRepository extends JpaRepository<EOCustProductWholeSale, Long>{

}
