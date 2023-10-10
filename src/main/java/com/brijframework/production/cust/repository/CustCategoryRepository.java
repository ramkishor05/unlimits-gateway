package com.brijframework.production.cust.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.cust.entities.EOCustCategory;

@Repository
@Transactional
public interface CustCategoryRepository extends JpaRepository<EOCustCategory, Long>{
	
	EOCustCategory findOneByTypeId(String typeId);

	@Query(nativeQuery = true, value = "select * from EOCUST_CATEGORY where CUST_PROD_APP_ID= ?1 and NAME=?2")
	Optional<EOCustCategory> findByCustAppAndName(Long id, String name);

	@Query(nativeQuery = true, value = "select * from EOCUST_CATEGORY where CUST_PROD_APP_ID= ?1 and TYPE_ID=?2")
	List<EOCustCategory> findAllByType(Long custAppId, String typeId);

	@Query(nativeQuery = true, value = "select * from EOCUST_CATEGORY where CUST_PROD_APP_ID= ?1")
	List<EOCustCategory>  findAllByCustAppId(long custAppId);

}
