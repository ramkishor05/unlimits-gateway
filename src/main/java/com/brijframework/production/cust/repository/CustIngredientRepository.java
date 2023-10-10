package com.brijframework.production.cust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.cust.entities.EOCustIngredient;

@Repository
@Transactional
public interface CustIngredientRepository extends JpaRepository<EOCustIngredient, Long>{
	
	EOCustIngredient findOneByCustProductionAppIdAndTypeId(long custProductionAppId, String typeId);

	List<EOCustIngredient> findAllByCustProductionAppId(long custProductionAppId);

	EOCustIngredient findByCustProductionAppIdAndTypeId(long custProductionAppId, String typeId);

}
