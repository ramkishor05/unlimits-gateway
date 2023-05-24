package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOCustProduct;

@Repository
@Transactional
public interface InventoryProductRepository extends JpaRepository<EOCustProduct, Long>{
	
	EOCustProduct findOneByTypeId(String typeId);

	List<EOCustProduct> findAllByInventoryAppId(long inventoryAppId);

	EOCustProduct findByInventoryAppIdAndTypeId(long inventoryAppId, String typeId);

	@Query(nativeQuery = true , value= "select ep.* from EOGlobalProduct ep where ep.InvAppID= ?1  and ep.id = ?2")
	EOCustProduct findByInventoryAppIdAndProductId(long inventoryAppId, Long id);

}
