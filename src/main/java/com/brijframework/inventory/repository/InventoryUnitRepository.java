package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.global.EOGlobalUnit;

@Repository
@Transactional
public interface InventoryUnitRepository extends JpaRepository<EOGlobalUnit, Long>{
	
	EOGlobalUnit findOneByTypeId(String typeId);

	List<EOGlobalUnit> findAllByUnitGroupId(long unitgroupId);

	EOGlobalUnit findOneByUnitGroupIdAndTypeId(long unitgroupId, String typeId);

}
