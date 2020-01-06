package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UICategory;
import com.brijframework.inventory.mapper.InventoryCategoryMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalCategory;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.repository.InventoryCategoryRepository;
import com.brijframework.inventory.service.InventoryCategoryService;

@Service
public class InventoryCategoryServiceImpl implements InventoryCategoryService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryCategoryRepository countFreqRepository;
	
	@Autowired
	InventoryCategoryMapper inventoryCategoryMapper;
	
	@Override
	public UICategory saveCategory(long inventoryAppId, UICategory unit) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveCategory(findById.get(), unit);
	}
	
	@Override
	public UICategory saveCategory(UICategory unit) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(unit.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveCategory(findById.get(), unit);
	}
	
	@Override
	public UICategory saveCategory(EOInventoryApp eoInventoryApp,UICategory unit) {
		EOGlobalCategory eoCategory=inventoryCategoryMapper.mapToDAO(unit);
		countFreqRepository.save(eoCategory);
		return inventoryCategoryMapper.mapToDTO(eoCategory);
	}

	@Override
	public UICategory getCategory(long id) {
		return inventoryCategoryMapper.mapToDTO(countFreqRepository.getOne(id));
	}

	@Override
	public List<UICategory> getCategoryList(long inventoryAppId) {
		return inventoryCategoryMapper.mapToDTO(countFreqRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UICategory getCategory(long inventoryAppId,String typeId) {
		return inventoryCategoryMapper.mapToDTO(countFreqRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
