package com.brijframework.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.model.EOCountFreq;

@Repository
@Transactional
public interface CountFreqRepository extends JpaRepository<EOCountFreq, Long>{
	
	EOCountFreq findOneByTypeId(String typeId);

}
