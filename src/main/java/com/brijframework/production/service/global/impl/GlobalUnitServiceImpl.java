package com.brijframework.production.service.global.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.global.UIGlobalUnit;
import com.brijframework.production.entities.global.EOGlobalUnit;
import com.brijframework.production.entities.global.EOGlobalUnitGroup;
import com.brijframework.production.mapper.global.GlobalUnitGroupMapper;
import com.brijframework.production.mapper.global.GlobalUnitMapper;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.repository.global.GlobalUnitGroupRepository;
import com.brijframework.production.repository.global.GlobalUnitRepository;
import com.brijframework.production.service.global.GlobalUnitService;

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
		EOGlobalUnitGroup eoGlobalUnitGroup = getGlobalUnitGroup(globalUnit);
		return saveUnit(eoGlobalUnitGroup, globalUnit);
	}

	private EOGlobalUnitGroup getGlobalUnitGroup(UIGlobalUnit globalUnit) {
		Optional<EOGlobalUnitGroup> findById = inventoryUnitGroupRepository.findById(1l);
		if(!findById.isPresent()) {
			findById = inventoryUnitGroupRepository.findById(1l);
			if(!findById.isPresent()) {
				return null;
			}
		}
		EOGlobalUnitGroup eoGlobalUnitGroup = findById.get();
		return eoGlobalUnitGroup;
	}
	
	@Override
	public UIGlobalUnit updateUnit(Long id, UIGlobalUnit uiGlobalUnit) {
		Optional<EOGlobalUnit> findById = inventoryUnitRepository.findById(id);
		if(!findById.isPresent()) {
			return null;
		}
		EOGlobalUnit eoGlobalUnit = findById.get();
		BeanUtils.copyProperties(uiGlobalUnit, eoGlobalUnit,"id", "unitGroup");
		EOGlobalUnitGroup eoGlobalUnitGroup = getGlobalUnitGroup(uiGlobalUnit);
		eoGlobalUnit.setUnitGroup(eoGlobalUnitGroup);
		inventoryUnitRepository.save(eoGlobalUnit);
		return inventoryUnitMapper.mapToDTO(eoGlobalUnit);
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
