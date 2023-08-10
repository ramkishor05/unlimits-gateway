package com.brijframework.production.repository.cust;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustCountFreq;

@Repository
@Transactional
public interface CustCountFreqRepository extends JpaRepository<EOCustCountFreq, Long>{

	@Query(nativeQuery = true, value = "select * from EOCUST_COUNT_FREQ where CUST_PROD_APP_ID= ?1 and NAME=?2")
	Optional<EOCustCountFreq> findByCustAppAndName(Long id, String name);

}
