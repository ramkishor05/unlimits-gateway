package com.brijframework.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIInventoryApplication;
import com.brijframework.inventory.contants.CountFreq;
import com.brijframework.inventory.mapper.InventoryApplicationMapper;
import com.brijframework.inventory.model.EOInvCountFreq;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.repository.CountFreqRepository;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.service.InventoryApplicationService;

@Service
public class InventoryApplicationServiceImpl implements InventoryApplicationService {
	
	@Autowired
	InventoryApplicationRepository InventoryApplicationRepository;
	
	@Autowired
	CountFreqRepository countFreqRepository;
	
	@Autowired
	InventoryApplicationMapper  inventoryApplicationMapper;

	@Override
	public UIInventoryApplication saveInventoryApp(UIInventoryApplication inventory) {
		EOInventoryApp eoInventoryApp=new EOInventoryApp();
		InventoryApplicationRepository.save(eoInventoryApp);
		for(CountFreq countFreq:CountFreq.values()) {
    		EOInvCountFreq eoCountFreq=new EOInvCountFreq(); 
    		eoCountFreq.setInventoryApp(eoInventoryApp);
    		eoCountFreq.setDescription(countFreq.getDesc());
    		eoCountFreq.setTypeId(countFreq.getTypeId());
    		eoCountFreq.setName(countFreq.getName());
    		countFreqRepository.save(eoCountFreq);
    	}
		return inventoryApplicationMapper.mapToDTO(eoInventoryApp);
	}

	@Override
	public UIInventoryApplication getInventoryApp(long id) {
		return null;
	}

	@Override
	public boolean deleteInventoryApp(long id) {
		return false;
	}

	@Override
	public List<UIInventoryApplication> getInventoryAppList() {
		return null;
	}

}
