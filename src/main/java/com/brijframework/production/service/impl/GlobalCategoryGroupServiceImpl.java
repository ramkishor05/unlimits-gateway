package com.brijframework.production.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UIGlobalCategoryGroup;
import com.brijframework.production.entities.EOGlobalCategoryGroup;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.GlobalCategoryGroupMapper;
import com.brijframework.production.repository.GlobalCategoryGroupRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.service.GlobalCategoryGroupService;

@Service
public class GlobalCategoryGroupServiceImpl implements GlobalCategoryGroupService {
	
	@Autowired
	private CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	private GlobalCategoryGroupRepository countFreqRepository;
	
	@Autowired
	private GlobalCategoryGroupMapper inventoryCategoryGroupMapper;
	
	@Override
	public UIGlobalCategoryGroup saveCategoryGroup(long inventoryAppId, UIGlobalCategoryGroup unitGroup) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveCategoryGroup(findById.get(), unitGroup);
	}
	
	@Override
	public UIGlobalCategoryGroup saveCategoryGroup(UIGlobalCategoryGroup unitGroup) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(unitGroup.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveCategoryGroup(findById.get(), unitGroup);
	}
	
	@Override
	public UIGlobalCategoryGroup saveCategoryGroup(EOCustProductionApp eoInventoryApp,UIGlobalCategoryGroup unitGroup) {
		EOGlobalCategoryGroup eoCategoryGroup=inventoryCategoryGroupMapper.mapToDAO(unitGroup);
		countFreqRepository.save(eoCategoryGroup);
		return inventoryCategoryGroupMapper.mapToDTO(eoCategoryGroup);
	}

	@Override
	public UIGlobalCategoryGroup getCategoryGroup(long id) {
		return inventoryCategoryGroupMapper.mapToDTO(countFreqRepository.getOne(id));
	}

	@Override
	public List<UIGlobalCategoryGroup> getCategoryGroupList(long inventoryAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UIGlobalCategoryGroup getCategoryGroup(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
