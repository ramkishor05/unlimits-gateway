package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalCategoryGroup;

@Repository
@Transactional
public interface InventoryCategoryGroupRepository extends JpaRepository<EOGlobalCategoryGroup, Long>{
	
	EOGlobalCategoryGroup findOneByTypeId(String typeId);

	List<EOGlobalCategoryGroup> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalCategoryGroup findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
