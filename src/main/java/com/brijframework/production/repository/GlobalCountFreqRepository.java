package com.brijframework.production.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.EOGlobalCountFreq;

@Repository
@Transactional
public interface GlobalCountFreqRepository extends JpaRepository<EOGlobalCountFreq, Long>{
	
	EOGlobalCountFreq findOneByTypeId(String typeId);

}
