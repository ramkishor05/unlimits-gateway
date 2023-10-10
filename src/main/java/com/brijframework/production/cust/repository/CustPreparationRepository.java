package com.brijframework.production.cust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.cust.entities.EOCustPreparation;

@Repository
@Transactional
public interface CustPreparationRepository extends JpaRepository<EOCustPreparation, Long>{
	
	List<EOCustPreparation> findAllByCustProductionAppId(long custProductionAppId);

	EOCustPreparation findByCustProductionAppIdAndTypeId(long custProductionAppId, String typeId);

}
