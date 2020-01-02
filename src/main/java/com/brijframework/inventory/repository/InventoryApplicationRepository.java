package com.brijframework.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.EOInventoryApp;

@Repository
@Transactional
public interface InventoryApplicationRepository  extends JpaRepository<EOInventoryApp, Long>{

}
