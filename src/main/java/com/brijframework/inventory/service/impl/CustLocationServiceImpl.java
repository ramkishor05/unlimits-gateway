package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.dto.UICustLocation;
import com.brijframework.inventory.entities.EOCustInventoryApp;
import com.brijframework.inventory.entities.EOCustLocation;
import com.brijframework.inventory.mapper.CustLocationMapper;
import com.brijframework.inventory.repository.CustInventoryAppRepository;
import com.brijframework.inventory.repository.CustLocationRepository;

@Service
public class CustLocationServiceImpl implements CustLocationService {
	
	@Autowired
	CustInventoryAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustLocationRepository inventoryLocationRepository;
	
	@Autowired
	CustLocationMapper inventoryLocationMapper;
	
	@Override
	public UICustLocation saveLocation(long inventoryAppId, UICustLocation Location) {
		Optional<EOCustInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveLocation(findById.get(), Location);
	}
	
	@Override
	public UICustLocation saveLocation(UICustLocation Location) {
		Optional<EOCustInventoryApp> findById = inventoryApplicationRepository.findById(Location.getCustInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveLocation(findById.get(), Location);
	}
	
	@Override
	public UICustLocation saveLocation(EOCustInventoryApp eoInventoryApp,UICustLocation Location) {
		EOCustLocation eoLocation=inventoryLocationMapper.mapToDAO(Location);
		inventoryLocationRepository.save(eoLocation);
		return inventoryLocationMapper.mapToDTO(eoLocation);
	}

	@Override
	public UICustLocation getLocation(long id) {
		return inventoryLocationMapper.mapToDTO(inventoryLocationRepository.getOne(id));
	}

	@Override
	public List<UICustLocation> getLocationList(long inventoryAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UICustLocation getLocation(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
