package com.brijframework.production.cust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.cust.entities.EOCustStorage;

@Repository
@Transactional
public interface CustStorageRepository extends JpaRepository<EOCustStorage, Long>{
	
	EOCustStorage findOneByTypeId(String typeId);

	List<EOCustStorage> findAllByCustProductionAppId(long custProductionAppId);

	EOCustStorage findByCustProductionAppIdAndTypeId(long custProductionAppId, String typeId);

}
