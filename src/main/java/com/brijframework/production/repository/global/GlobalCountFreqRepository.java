package com.brijframework.production.repository.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.global.EOGlobalCountFreq;

@Repository
@Transactional
public interface GlobalCountFreqRepository extends JpaRepository<EOGlobalCountFreq, Long>{
	
	EOGlobalCountFreq findOneByTypeId(String typeId);

}
