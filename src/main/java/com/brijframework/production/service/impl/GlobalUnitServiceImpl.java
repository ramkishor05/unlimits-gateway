package com.brijframework.production.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UIGlobalUnit;
import com.brijframework.production.dto.UIGlobalUnitGroup;
import com.brijframework.production.entities.EOGlobalUnit;
import com.brijframework.production.entities.EOGlobalUnitGroup;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.GlobalUnitGroupMapper;
import com.brijframework.production.mapper.GlobalUnitMapper;
import com.brijframework.production.repository.GlobalUnitGroupRepository;
import com.brijframework.production.repository.GlobalUnitRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.service.GlobalUnitService;

@Service
public class GlobalUnitServiceImpl implements GlobalUnitService {
	
	@Autowired
	CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	GlobalUnitGroupRepository inventoryUnitGroupRepository;
	
	@Autowired
	GlobalUnitGroupMapper inventoryUnitGroupMapper;
	
	@Autowired
	GlobalUnitRepository inventoryUnitRepository;
	
	@Autowired
	GlobalUnitMapper inventoryUnitMapper;

	@Override
	public UIGlobalUnit saveUnit(UIGlobalUnit globalUnit) {
		Optional<EOGlobalUnitGroup> findById = inventoryUnitGroupRepository.findById(globalUnit.getUnitGroupId());
		if(!findById.isPresent()) {
			findById = inventoryUnitGroupRepository.findById(1l);
			if(!findById.isPresent()) {
				return null;
			}
		}
		return saveUnit(findById.get(), globalUnit);
	}
	
	@Override
	public UIGlobalUnit saveUnit(EOGlobalUnitGroup eoUnitGroup,UIGlobalUnit unit) {
		EOGlobalUnit eoUnit=inventoryUnitMapper.mapToDAO(unit);
		eoUnit.setUnitGroup(eoUnitGroup);
		inventoryUnitRepository.save(eoUnit);
		return inventoryUnitMapper.mapToDTO(eoUnit);
	}

	@Override
	public List<UIGlobalUnit> getUnitList() {
		return inventoryUnitMapper.mapToDTO(inventoryUnitRepository.findAll());
	}

}
