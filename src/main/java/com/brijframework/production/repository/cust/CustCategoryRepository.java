package com.brijframework.production.repository.cust;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustCategory;

@Repository
@Transactional
public interface CustCategoryRepository extends JpaRepository<EOCustCategory, Long>{
	
	EOCustCategory findOneByTypeId(String typeId);

}
