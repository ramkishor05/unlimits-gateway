package com.brijframework.production.repository.cust;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustProductionApp;

@Repository
@Transactional
public interface CustProductionAppRepository  extends JpaRepository<EOCustProductionApp, Long>{

}
