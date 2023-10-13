package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.entities.EOCustLocation;

@Repository
@Transactional
public interface CustLocationRepository extends JpaRepository<EOCustLocation, Long>{
	
	EOCustLocation findOneByCusIinventoryAppIdAndTypeId(long cusIinventoryAppId, String typeId);

	List<EOCustLocation> findAllByCusIinventoryAppId(long cusIinventoryAppId);

	EOCustLocation findByCusIinventoryAppIdAndTypeId(long cusIinventoryAppId, String typeId);

}
