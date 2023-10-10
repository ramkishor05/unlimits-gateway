package com.brijframework.production.global.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.global.entities.EOGlobalCategoryGroup;

@Repository
@Transactional
public interface GlobalCategoryGroupRepository extends JpaRepository<EOGlobalCategoryGroup, Long>{
	
	EOGlobalCategoryGroup findOneByTypeId(String typeId);

	@Query(nativeQuery = true, value = "select * from EOGLOBAL_CATEGORY_GROUP where record_state in (?1)")
	List<EOGlobalCategoryGroup> findAllByStatus(List<Integer> statusIds);

	@Query(nativeQuery = true, value = "select * from EOGLOBAL_CATEGORY_GROUP where type_id = ?1")
	List<EOGlobalCategoryGroup> findAllByTypeId(String typeId);
}
