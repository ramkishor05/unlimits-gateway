package com.brijframework.production.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.global.entities.EOGlobalUnitConversion;

@Repository
@Transactional
public interface GlobalUnitConversionRepository extends JpaRepository<EOGlobalUnitConversion, Long>{
	
	EOGlobalUnitConversion findOneByTypeId(String typeId);

	int countByTypeId(String typeId);

}
