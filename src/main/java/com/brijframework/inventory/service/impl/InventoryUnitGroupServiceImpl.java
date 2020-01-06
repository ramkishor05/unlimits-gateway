package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIUnit;
import com.brijframework.inventory.bean.UIUnitGroup;
import com.brijframework.inventory.mapper.InventoryUnitGroupMapper;
import com.brijframework.inventory.mapper.InventoryUnitMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalUnit;
import com.brijframework.inventory.model.global.EOGlobalUnitGroup;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.repository.InventoryUnitGroupRepository;
import com.brijframework.inventory.repository.InventoryUnitRepository;
import com.brijframework.inventory.service.InventoryUnitGroupService;

@Service
public class InventoryUnitGroupServiceImpl implements InventoryUnitGroupService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryUnitGroupRepository inventoryUnitGroupRepository;
	
	@Autowired
	InventoryUnitGroupMapper inventoryUnitGroupMapper;
	
	@Autowired
	InventoryUnitRepository inventoryUnitRepository;
	
	@Autowired
	InventoryUnitMapper inventoryUnitMapper;
	
	@Override
	public UIUnitGroup saveUnitGroup(long inventoryAppId, UIUnitGroup unitGroup) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveUnitGroup(findById.get(), unitGroup);
	}
	
	@Override
	public UIUnitGroup saveUnitGroup(UIUnitGroup unitGroup) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(unitGroup.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveUnitGroup(findById.get(), unitGroup);
	}
	
	@Override
	public UIUnitGroup saveUnitGroup(EOInventoryApp eoInventoryApp,UIUnitGroup unitGroup) {
		EOGlobalUnitGroup eoUnitGroup=inventoryUnitGroupMapper.mapToDAO(unitGroup);
		inventoryUnitGroupRepository.save(eoUnitGroup);
		return inventoryUnitGroupMapper.mapToDTO(eoUnitGroup);
	}

	@Override
	public UIUnitGroup getUnitGroup(long id) {
		return inventoryUnitGroupMapper.mapToDTO(inventoryUnitGroupRepository.getOne(id));
	}

	@Override
	public List<UIUnitGroup> getUnitGroupList(long inventoryAppId) {
		return inventoryUnitGroupMapper.mapToDTO(inventoryUnitGroupRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UIUnitGroup getUnitGroup(long inventoryAppId,String typeId) {
		return inventoryUnitGroupMapper.mapToDTO(inventoryUnitGroupRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

	@Override
	public UIUnit saveUnit(long unitgroupId, UIUnit unit) {
		Optional<EOGlobalUnitGroup> findById = inventoryUnitGroupRepository.findById(unitgroupId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveUnit(findById.get(), unit);
	}
	
	@Override
	public UIUnit saveUnit(EOGlobalUnitGroup eoUnitGroup,UIUnit unit) {
		EOGlobalUnit eoUnit=inventoryUnitMapper.mapToDAO(unit);
		eoUnit.setUnitGroup(eoUnitGroup);
		inventoryUnitRepository.save(eoUnit);
		return inventoryUnitMapper.mapToDTO(eoUnit);
	}


	@Override
	public UIUnit getUnit(long unitgroupId, String typeId) {
		return inventoryUnitMapper.mapToDTO(inventoryUnitRepository.findOneByUnitGroupIdAndTypeId(unitgroupId,typeId));
	}

	@Override
	public List<UIUnit> getUnitList(long unitgroupId) {
		return inventoryUnitMapper.mapToDTO(inventoryUnitRepository.findAllByUnitGroupId(unitgroupId));
	}

}
