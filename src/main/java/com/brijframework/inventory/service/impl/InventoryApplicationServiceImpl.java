package com.brijframework.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIInventoryApplication;
import com.brijframework.inventory.bean.UIInventoryApplicationDetail;
import com.brijframework.inventory.contants.CountFreq;
import com.brijframework.inventory.mapper.InventoryApplicationDetailMapper;
import com.brijframework.inventory.mapper.InventoryApplicationMapper;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.repository.InventoryCountFreqRepository;
import com.brijframework.inventory.repository.InventoryApplicationRepository;
import com.brijframework.inventory.service.InventoryApplicationService;
import com.brijframework.inventory.service.InventoryCountFreqService;

@Service
public class InventoryApplicationServiceImpl implements InventoryApplicationService {
	
	@Autowired
	InventoryApplicationRepository inventoryApplicationRepository;
	
	@Autowired
	InventoryCountFreqRepository countFreqRepository;
	
	@Autowired
	InventoryApplicationMapper  inventoryApplicationMapper;
	
	@Autowired
	InventoryApplicationDetailMapper inventoryApplicationDetailMapper;
	
	@Autowired
	InventoryCountFreqService inventoryCountFreqService;

	@Override
	public UIInventoryApplication saveInventoryApp(UIInventoryApplication inventory) {
		EOInventoryApp eoInventoryApp=new EOInventoryApp();
		eoInventoryApp.setId(inventory.getId());
		eoInventoryApp.setAppid(inventory.getAppid());
		eoInventoryApp.setCustId(inventory.getCustId());
		inventoryApplicationRepository.save(eoInventoryApp);
		for(CountFreq countFreq:CountFreq.values()) {
			inventoryCountFreqService.saveCountFreq(eoInventoryApp, countFreq.getCountFreq());
    	}
		return inventoryApplicationMapper.mapToDTO(eoInventoryApp);
	}

	@Override
	public UIInventoryApplication getInventoryApp(long id) {
		return inventoryApplicationMapper.mapToDTO( inventoryApplicationRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );
	}

	@Override
	public boolean deleteInventoryApp(long id) {
		return false;
	}

	@Override
	public List<UIInventoryApplication> getInventoryAppList() {
		return null;
	}

	@Override
	public UIInventoryApplicationDetail getInventoryAppDetail(long id) {
		return inventoryApplicationDetailMapper.mapToDTO( inventoryApplicationRepository.findById(id).orElseThrow(()-> new RuntimeException("Not fond")) );

	}
}
