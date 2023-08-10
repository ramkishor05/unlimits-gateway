package com.brijframework.production.repository.cust;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustCategoryGroup;

@Repository
@Transactional
public interface CustCategoryGroupRepository extends JpaRepository<EOCustCategoryGroup, Long>{
	
	EOCustCategoryGroup findOneByTypeId(String typeId);

	@Query(nativeQuery = true, value = "select * from EOCUST_CATEGORY_GROUP where CUST_PROD_APP_ID= ?1 and NAME=?2")
	Optional<EOCustCategoryGroup> findByCustAppAndName(Long id, String name);

}
