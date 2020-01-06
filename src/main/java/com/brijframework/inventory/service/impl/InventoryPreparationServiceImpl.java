package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIPreparation;
import com.brijframework.inventory.mapper.InventoryPreparationMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalPreparation;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.repository.InventoryPreparationRepository;
import com.brijframework.inventory.service.InventoryPreparationService;

@Service
public class InventoryPreparationServiceImpl implements InventoryPreparationService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryPreparationRepository inventoryPreparationRepository;
	
	@Autowired
	InventoryPreparationMapper inventoryPreparationMapper;
	
	@Override
	public UIPreparation savePreparation(long inventoryAppId, UIPreparation Preparation) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return savePreparation(findById.get(), Preparation);
	}
	
	@Override
	public UIPreparation savePreparation(UIPreparation Preparation) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(Preparation.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return savePreparation(findById.get(), Preparation);
	}
	
	@Override
	public UIPreparation savePreparation(EOInventoryApp eoInventoryApp,UIPreparation Preparation) {
		EOGlobalPreparation eoPreparation=inventoryPreparationMapper.mapToDAO(Preparation);
		inventoryPreparationRepository.save(eoPreparation);
		return inventoryPreparationMapper.mapToDTO(eoPreparation);
	}

	@Override
	public UIPreparation getPreparation(long id) {
		return inventoryPreparationMapper.mapToDTO(inventoryPreparationRepository.getOne(id));
	}

	@Override
	public List<UIPreparation> getPreparationList(long inventoryAppId) {
		return inventoryPreparationMapper.mapToDTO(inventoryPreparationRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UIPreparation getPreparation(long inventoryAppId,String typeId) {
		return inventoryPreparationMapper.mapToDTO(inventoryPreparationRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
