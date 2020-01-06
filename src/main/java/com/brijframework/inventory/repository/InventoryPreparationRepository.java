package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalPreparation;

@Repository
@Transactional
public interface InventoryPreparationRepository extends JpaRepository<EOGlobalPreparation, Long>{
	
	EOGlobalPreparation findOneByTypeId(String typeId);

	List<EOGlobalPreparation> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalPreparation findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
