package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalCategory;

@Repository
@Transactional
public interface InventoryCategoryRepository extends JpaRepository<EOGlobalCategory, Long>{
	
	EOGlobalCategory findOneByTypeId(String typeId);

	List<EOGlobalCategory> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalCategory findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
