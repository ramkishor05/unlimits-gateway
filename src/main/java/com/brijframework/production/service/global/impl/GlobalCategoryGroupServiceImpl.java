package com.brijframework.production.service.global.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.contants.DataStatus;
import com.brijframework.production.dto.global.UIGlobalCategoryGroup;
import com.brijframework.production.entities.EOGlobalCategoryGroup;
import com.brijframework.production.mapper.global.GlobalCategoryGroupMapper;
import com.brijframework.production.repository.GlobalCategoryGroupRepository;
import com.brijframework.production.service.global.GlobalCategoryGroupService;

@Service
public class GlobalCategoryGroupServiceImpl implements GlobalCategoryGroupService {
	
	@Autowired
	private GlobalCategoryGroupRepository countFreqRepository;
	
	@Autowired
	private GlobalCategoryGroupMapper inventoryCategoryGroupMapper;
	
	@Override
	public UIGlobalCategoryGroup saveCategoryGroup(UIGlobalCategoryGroup unitGroup) {
		EOGlobalCategoryGroup eoCategoryGroup=inventoryCategoryGroupMapper.mapToDAO(unitGroup);
		countFreqRepository.save(eoCategoryGroup);
		return inventoryCategoryGroupMapper.mapToDTO(eoCategoryGroup);
	}

	@Override
	public UIGlobalCategoryGroup getCategoryGroup(long id) {
		return inventoryCategoryGroupMapper.mapToDTO(countFreqRepository.getOne(id));
	}

	@Override
	public List<UIGlobalCategoryGroup> getCategoryGroupList() {
		return inventoryCategoryGroupMapper.mapToDTO(countFreqRepository.findAll());
	}
	
	@Override
	public List<UIGlobalCategoryGroup> getCategoryGroupList(DataStatus dataStatus) {
		return inventoryCategoryGroupMapper.mapToDTO(countFreqRepository.findAllBy());
	}

	@Override
	public UIGlobalCategoryGroup getCategoryGroup(String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
