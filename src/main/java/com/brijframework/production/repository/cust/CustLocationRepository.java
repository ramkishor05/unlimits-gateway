package com.brijframework.production.repository.cust;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustLocation;

@Repository
@Transactional
public interface CustLocationRepository extends JpaRepository<EOCustLocation, Long>{
	
	EOCustLocation findOneByCustProductionAppIdAndTypeId(long custProductionAppId, String typeId);

	List<EOCustLocation> findAllByCustProductionAppId(long custProductionAppId);

	EOCustLocation findByCustProductionAppIdAndTypeId(long custProductionAppId, String typeId);

}
