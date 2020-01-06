package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalLocation;

@Repository
@Transactional
public interface InventoryLocationRepository extends JpaRepository<EOGlobalLocation, Long>{
	
	EOGlobalLocation findOneByTypeId(String typeId);

	List<EOGlobalLocation> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalLocation findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
