package com.brijframework.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UIGlobalCategory;
import com.brijframework.production.entities.EOGlobalCategory;
import com.brijframework.production.mapper.GlobalCategoryMapper;
import com.brijframework.production.repository.GlobalCategoryRepository;
import com.brijframework.production.service.GlobalCategoryService;

@Service
public class GlobalCategoryServiceIMpl implements GlobalCategoryService {
	
	@Autowired
	private GlobalCategoryRepository globalCategoryRepository;
	
	@Autowired
	private GlobalCategoryMapper globalCategoryMapper;

	@Override
	public UIGlobalCategory saveCategory(UIGlobalCategory uiGlobalCategory) {
		EOGlobalCategory eoGlobalCategory = globalCategoryMapper.mapToDAO(uiGlobalCategory);
		eoGlobalCategory=globalCategoryRepository.saveAndFlush(eoGlobalCategory);
		return globalCategoryMapper.mapToDTO(eoGlobalCategory);
	}

	@Override
	public UIGlobalCategory getCategory(Long id) {
	    return globalCategoryMapper.mapToDTO(globalCategoryRepository.findById(id).orElse(null));
	}

	@Override
	public List<UIGlobalCategory> getCategoryList() {
		return globalCategoryMapper.mapToDTO(globalCategoryRepository.findAll());
	}

	@Override
	public List<UIGlobalCategory> findAllByType(String typeId) {
		return globalCategoryMapper.mapToDTO(globalCategoryRepository.findOneByTypeId(typeId));
	}

}
