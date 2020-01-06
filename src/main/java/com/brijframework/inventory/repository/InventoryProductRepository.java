package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalProduct;

@Repository
@Transactional
public interface InventoryProductRepository extends JpaRepository<EOGlobalProduct, Long>{
	
	EOGlobalProduct findOneByTypeId(String typeId);

	List<EOGlobalProduct> findAllByInventoryAppId(long inventoryAppId);

	EOGlobalProduct findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

}
