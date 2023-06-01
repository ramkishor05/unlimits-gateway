package com.brijframework.production.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.EOGlobalCategoryGroup;

@Repository
@Transactional
public interface GlobalCategoryGroupRepository extends JpaRepository<EOGlobalCategoryGroup, Long>{
	
	EOGlobalCategoryGroup findOneByTypeId(String typeId);
}
