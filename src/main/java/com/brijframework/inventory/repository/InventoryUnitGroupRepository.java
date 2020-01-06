package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalUnitGroup;

@Repository
@Transactional
public interface InventoryUnitGroupRepository extends JpaRepository<EOGlobalUnitGroup, Long>{
	
	EOGlobalUnitGroup findOneByTypeId(String typeId);

	List<EOGlobalUnitGroup> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalUnitGroup findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
