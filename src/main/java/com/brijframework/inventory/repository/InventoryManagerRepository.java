package com.brijframework.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.EOInventoryManager;

@Repository
@Transactional
public interface InventoryManagerRepository extends JpaRepository<EOInventoryManager, Long>{
	
	//@Query("Select inv from EOInventory inv where inv.countFreq.id = :countFreq and inv.busiDate < :busiDate order by inv.busiDate desc LIMIT 1")
//	public EOInventory findFirstByOrderByBusiDateAscAndCountFreqId(Date busiDate, long countFreq);

}
