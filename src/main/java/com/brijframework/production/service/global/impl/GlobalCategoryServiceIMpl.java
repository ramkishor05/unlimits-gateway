package com.brijframework.production.service.global.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.entities.global.EOGlobalCategory;
import com.brijframework.production.mapper.global.GlobalCategoryRequestMapper;
import com.brijframework.production.mapper.global.GlobalCategoryResponseMapper;
import com.brijframework.production.repository.global.GlobalCategoryRepository;
import com.brijframework.production.rest.global.GlobalCategoryRequest;
import com.brijframework.production.rest.global.GlobalCategoryResponse;
import com.brijframework.production.service.global.GlobalCategoryService;

@Service
public class GlobalCategoryServiceIMpl implements GlobalCategoryService {
	
	@Autowired
	private GlobalCategoryRepository globalCategoryRepository;
	
	@Autowired
	private GlobalCategoryRequestMapper globalCategoryRequestMapper;
	
	@Autowired
	private GlobalCategoryResponseMapper globalCategoryResponseMapper;

	@Override
	public GlobalCategoryResponse saveCategory(GlobalCategoryRequest uiGlobalCategory) {
		EOGlobalCategory eoGlobalCategory = globalCategoryRequestMapper.mapToDAO(uiGlobalCategory);
		eoGlobalCategory=globalCategoryRepository.saveAndFlush(eoGlobalCategory);
		return globalCategoryResponseMapper.mapToDTO(eoGlobalCategory);
	}

	@Override
	public GlobalCategoryResponse getCategory(Long id) {
	    return globalCategoryResponseMapper.mapToDTO(globalCategoryRepository.findById(id).orElse(null));
	}

	@Override
	public List<GlobalCategoryResponse> getCategoryList() {
		return globalCategoryResponseMapper.mapToDTO(globalCategoryRepository.findAll());
	}

	@Override
	public List<GlobalCategoryResponse> findAllByType(String typeId) {
		return globalCategoryResponseMapper.mapToDTO(globalCategoryRepository.findOneByTypeId(typeId));
	}
	
	@Override
	public boolean deleteCategory(Long id) {
		globalCategoryRepository.deleteById(id);
		return true;
	}

}
