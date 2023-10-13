package com.brijframework.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.entities.EOCustInventoryApp;

@Repository
@Transactional
public interface CustInventoryAppRepository  extends JpaRepository<EOCustInventoryApp, Long>{

}
