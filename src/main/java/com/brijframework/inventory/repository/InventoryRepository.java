package com.brijframework.inventory.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.EOInventory;

@Repository
@Transactional
public interface InventoryRepository extends JpaRepository<EOInventory, Long>{
	
	@Query("Select in from EOInventory in where in.countFreq.id = :countFreq and in.busiDate < :busiDate order by busiDate desc limit 1")
	public EOInventory lastInventory(Date busiDate, long countFreq);

}
