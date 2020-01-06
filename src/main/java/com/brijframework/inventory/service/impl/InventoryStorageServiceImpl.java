package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIStorage;
import com.brijframework.inventory.mapper.InventoryStorageMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalStorage;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.repository.InventoryStorageRepository;
import com.brijframework.inventory.service.InventoryStorageService;

@Service
public class InventoryStorageServiceImpl implements InventoryStorageService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryStorageRepository inventoryStorageRepository;
	
	@Autowired
	InventoryStorageMapper inventoryStorageMapper;
	
	@Override
	public UIStorage saveStorage(long inventoryAppId, UIStorage Storage) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveStorage(findById.get(), Storage);
	}
	
	@Override
	public UIStorage saveStorage(UIStorage Storage) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(Storage.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveStorage(findById.get(), Storage);
	}
	
	@Override
	public UIStorage saveStorage(EOInventoryApp eoInventoryApp,UIStorage Storage) {
		EOGlobalStorage eoStorage=inventoryStorageMapper.mapToDAO(Storage);
		inventoryStorageRepository.save(eoStorage);
		return inventoryStorageMapper.mapToDTO(eoStorage);
	}

	@Override
	public UIStorage getStorage(long id) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.getOne(id));
	}

	@Override
	public List<UIStorage> getStorageList(long inventoryAppId) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UIStorage getStorage(long inventoryAppId,String typeId) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
