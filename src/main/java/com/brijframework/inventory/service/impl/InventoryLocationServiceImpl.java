package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UILocation;
import com.brijframework.inventory.mapper.InventoryLocationMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalLocation;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.repository.InventoryLocationRepository;
import com.brijframework.inventory.service.InventoryLocationService;

@Service
public class InventoryLocationServiceImpl implements InventoryLocationService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryLocationRepository inventoryLocationRepository;
	
	@Autowired
	InventoryLocationMapper inventoryLocationMapper;
	
	@Override
	public UILocation saveLocation(long inventoryAppId, UILocation Location) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveLocation(findById.get(), Location);
	}
	
	@Override
	public UILocation saveLocation(UILocation Location) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(Location.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveLocation(findById.get(), Location);
	}
	
	@Override
	public UILocation saveLocation(EOInventoryApp eoInventoryApp,UILocation Location) {
		EOGlobalLocation eoLocation=inventoryLocationMapper.mapToDAO(Location);
		inventoryLocationRepository.save(eoLocation);
		return inventoryLocationMapper.mapToDTO(eoLocation);
	}

	@Override
	public UILocation getLocation(long id) {
		return inventoryLocationMapper.mapToDTO(inventoryLocationRepository.getOne(id));
	}

	@Override
	public List<UILocation> getLocationList(long inventoryAppId) {
		return inventoryLocationMapper.mapToDTO(inventoryLocationRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UILocation getLocation(long inventoryAppId,String typeId) {
		return inventoryLocationMapper.mapToDTO(inventoryLocationRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
