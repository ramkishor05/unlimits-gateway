package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalCountFreq;

@Repository
@Transactional
public interface InventoryCountFreqRepository extends JpaRepository<EOGlobalCountFreq, Long>{
	
	EOGlobalCountFreq findOneByTypeId(String typeId);

	List<EOGlobalCountFreq> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalCountFreq findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
