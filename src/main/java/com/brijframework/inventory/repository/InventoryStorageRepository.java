package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalStorage;

@Repository
@Transactional
public interface InventoryStorageRepository extends JpaRepository<EOGlobalStorage, Long>{
	
	EOGlobalStorage findOneByTypeId(String typeId);

	List<EOGlobalStorage> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalStorage findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
