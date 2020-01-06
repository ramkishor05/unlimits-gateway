package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UICountFreq;
import com.brijframework.inventory.mapper.InventoryCountFreqMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalCountFreq;
import com.brijframework.inventory.repository.InventoryCountFreqRepository;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.service.InventoryCountFreqService;

@Service
public class InventoryCountFreqServiceImpl implements InventoryCountFreqService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryCountFreqRepository countFreqRepository;
	
	@Autowired
	InventoryCountFreqMapper inventoryCountFreqMapper;
	
	@Override
	public UICountFreq saveCountFreq(long inventoryAppId, UICountFreq countFreq) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveCountFreq(findById.get(), countFreq);
	}
	
	@Override
	public UICountFreq saveCountFreq(UICountFreq countFreq) {
		Optional<EOInventoryApp> findById = inventoryApplicationRepository.findById(countFreq.getInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveCountFreq(findById.get(), countFreq);
	}
	
	@Override
	public UICountFreq saveCountFreq(EOInventoryApp inventoryApp,UICountFreq countFreq) {
		EOGlobalCountFreq eoCountFreq=inventoryCountFreqMapper.mapToDAO(countFreq);
		eoCountFreq.setInventoryApp(inventoryApp);
		countFreqRepository.save(eoCountFreq);
		return inventoryCountFreqMapper.mapToDTO(eoCountFreq);
	}

	@Override
	public UICountFreq getCountFreq(long id) {
		return inventoryCountFreqMapper.mapToDTO(countFreqRepository.getOne(id));
	}

	@Override
	public List<UICountFreq> getCountFreqList(long inventoryAppId) {
		return inventoryCountFreqMapper.mapToDTO(countFreqRepository.findAllByInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UICountFreq getCountFreq(long inventoryAppId,String typeId) {
		return inventoryCountFreqMapper.mapToDTO(countFreqRepository.findByInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
