package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.dto.UICustPreparation;
import com.brijframework.inventory.entities.EOCustInventoryApp;
import com.brijframework.inventory.entities.EOCustPreparation;
import com.brijframework.inventory.mapper.CustPreparationMapper;
import com.brijframework.inventory.repository.CustInventoryAppRepository;
import com.brijframework.inventory.repository.CustPreparationRepository;

@Service
public class CustPreparationServiceImpl implements CustPreparationService {
	
	@Autowired
	CustInventoryAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustPreparationRepository inventoryPreparationRepository;
	
	@Autowired
	CustPreparationMapper inventoryPreparationMapper;
	
	@Override
	public UICustPreparation savePreparation(long inventoryAppId, UICustPreparation Preparation) {
		Optional<EOCustInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return savePreparation(findById.get(), Preparation);
	}
	
	@Override
	public UICustPreparation savePreparation(UICustPreparation Preparation) {
		Optional<EOCustInventoryApp> findById = inventoryApplicationRepository.findById(Preparation.getCustInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return savePreparation(findById.get(), Preparation);
	}
	
	@Override
	public UICustPreparation savePreparation(EOCustInventoryApp eoInventoryApp,UICustPreparation Preparation) {
		EOCustPreparation eoPreparation=inventoryPreparationMapper.mapToDAO(Preparation);
		inventoryPreparationRepository.save(eoPreparation);
		return inventoryPreparationMapper.mapToDTO(eoPreparation);
	}

	@Override
	public UICustPreparation getPreparation(long id) {
		return inventoryPreparationMapper.mapToDTO(inventoryPreparationRepository.getOne(id));
	}

	@Override
	public List<UICustPreparation> getPreparationList(long inventoryAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UICustPreparation getPreparation(long inventoryAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
