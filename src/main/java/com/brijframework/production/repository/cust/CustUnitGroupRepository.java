package com.brijframework.production.repository.cust;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustUnitGroup;

@Repository
@Transactional
public interface CustUnitGroupRepository extends JpaRepository<EOCustUnitGroup, Long>{

	@Query(nativeQuery = true, value = "select * from EOCUST_UNIT_GROUP where CUST_PROD_APP_ID= ?1 and NAME=?2")
	Optional<EOCustUnitGroup> findByCustAppAndName(Long id, String name);

}
