package com.brijframework.production.global.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.global.entities.EOGlobalCategory;
import com.brijframework.production.global.mapper.GlobalCategoryRequestMapper;
import com.brijframework.production.global.mapper.GlobalCategoryResponseMapper;
import com.brijframework.production.global.repository.GlobalCategoryRepository;
import com.brijframework.production.global.rest.GlobalCategoryRequest;
import com.brijframework.production.global.rest.GlobalCategoryResponse;
import com.brijframework.production.global.service.GlobalCategoryService;

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
