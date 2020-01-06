package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UICategoryGroup;
import com.brijframework.inventory.mapper.InventoryCategoryGroupMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalCategoryGroup;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.repository.InventoryCategoryGroupRepository;
import com.brijframework.inventory.service.InventoryCategoryGroupService;

@Service
public class InventoryCategoryGroupServiceImpl implements InventoryCategoryGroupService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryCategoryGroupRepository countFreqRepository;
	
	@Autowired
	InventoryCategoryGroupMapper inventoryCategoryGroupMapper;
	
	@Override
	public UICategoryGroup saveCategoryGroup(long inventoryAppId, UICategoryGroup unitGroup) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveCategoryGroup(findById.get(), unitGroup);
	}
	
	@Override
	public UICategoryGroup saveCategoryGroup(UICategoryGroup unitGroup) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(unitGroup.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveCategoryGroup(findById.get(), unitGroup);
	}
	
	@Override
	public UICategoryGroup saveCategoryGroup(EOInventoryApp eoInventoryApp,UICategoryGroup unitGroup) {
		EOGlobalCategoryGroup eoCategoryGroup=inventoryCategoryGroupMapper.mapToDAO(unitGroup);
		countFreqRepository.save(eoCategoryGroup);
		return inventoryCategoryGroupMapper.mapToDTO(eoCategoryGroup);
	}

	@Override
	public UICategoryGroup getCategoryGroup(long id) {
		return inventoryCategoryGroupMapper.mapToDTO(countFreqRepository.getOne(id));
	}

	@Override
	public List<UICategoryGroup> getCategoryGroupList(long inventoryAppId) {
		return inventoryCategoryGroupMapper.mapToDTO(countFreqRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UICategoryGroup getCategoryGroup(long inventoryAppId,String typeId) {
		return inventoryCategoryGroupMapper.mapToDTO(countFreqRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
