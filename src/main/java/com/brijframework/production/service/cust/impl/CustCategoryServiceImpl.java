package com.brijframework.production.service.cust.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UICustCategory;
import com.brijframework.production.entities.cust.EOCustCategory;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.cust.CustCategoryMapper;
import com.brijframework.production.repository.cust.CustCategoryRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.service.cust.CustCategoryService;

@Service
public class CustCategoryServiceImpl implements CustCategoryService {
	
	@Autowired
	CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustCategoryRepository countFreqRepository;
	
	@Autowired
	CustCategoryMapper inventoryCategoryMapper;
	
	@Override
	public UICustCategory saveCategory(long inventoryAppId, UICustCategory unit) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveCategory(findById.get(), unit);
	}
	
	@Override
	public UICustCategory saveCategory(UICustCategory unit) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(unit.getCustProductionAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveCategory(findById.get(), unit);
	}
	
	@Override
	public UICustCategory saveCategory(EOCustProductionApp eoInventoryApp,UICustCategory unit) {
		EOCustCategory eoCategory=inventoryCategoryMapper.mapToDAO(unit);
		countFreqRepository.save(eoCategory);
		return inventoryCategoryMapper.mapToDTO(eoCategory);
	}

	@Override
	public UICustCategory getCategory(long id) {
		return inventoryCategoryMapper.mapToDTO(countFreqRepository.getOne(id));
	}

	@Override
	public List<UICustCategory> getCategoryList(long inventoryAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UICustCategory getCategory(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}


}
