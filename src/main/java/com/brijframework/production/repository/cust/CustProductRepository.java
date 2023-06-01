package com.brijframework.production.repository.cust;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustProduct;

@Repository
@Transactional
public interface CustProductRepository extends JpaRepository<EOCustProduct, Long>{
	
	List<EOCustProduct> findAllByCustProductionAppId(long custProductionAppId);

	EOCustProduct findByCustProductionAppIdAndTypeId(long custProductionAppId, String typeId);


}
