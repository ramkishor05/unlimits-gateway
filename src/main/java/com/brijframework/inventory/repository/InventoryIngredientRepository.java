package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalIngredient;

@Repository
@Transactional
public interface InventoryIngredientRepository extends JpaRepository<EOGlobalIngredient, Long>{
	
	EOGlobalIngredient findOneByTypeId(String typeId);

	List<EOGlobalIngredient> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalIngredient findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
