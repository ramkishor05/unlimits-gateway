package com.brijframework.production.inventory.service.cust;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.cust.dto.UICustLocation;
import com.brijframework.production.cust.entities.EOCustLocation;
import com.brijframework.production.cust.entities.EOCustProductionApp;
import com.brijframework.production.cust.mapper.CustLocationMapper;
import com.brijframework.production.cust.repository.CustLocationRepository;
import com.brijframework.production.cust.repository.CustProductionAppRepository;

@Service
public class CustLocationServiceImpl implements CustLocationService {
	
	@Autowired
	CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustLocationRepository inventoryLocationRepository;
	
	@Autowired
	CustLocationMapper inventoryLocationMapper;
	
	@Override
	public UICustLocation saveLocation(long inventoryAppId, UICustLocation Location) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveLocation(findById.get(), Location);
	}
	
	@Override
	public UICustLocation saveLocation(UICustLocation Location) {
		Optional<EOCustProductionApp> findById = inventoryApplicationRepository.findById(Location.getCustProductionAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveLocation(findById.get(), Location);
	}
	
	@Override
	public UICustLocation saveLocation(EOCustProductionApp eoInventoryApp,UICustLocation Location) {
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
