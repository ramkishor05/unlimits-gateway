package com.brijframework.inventory.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIInventory;
import com.brijframework.inventory.mapper.InventoryMapper;
import com.brijframework.inventory.model.EOInventory;
import com.brijframework.inventory.repository.InventoryRepository;
import com.brijframework.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	InventoryMapper inventoryMapper;
	

	@Autowired
	InventoryRepository inventoryRepository;
	
	
	@Override
	public UIInventory saveInventory(UIInventory inventory) {
		Date busiDate=new Date();
		EOInventory eoInventory = inventoryMapper.mapToDAO(inventory);
		EOInventory lastInventory = inventoryRepository.lastInventory(busiDate, inventory.getCountFreq());
		eoInventory.setOpeningInv(lastInventory);
		return inventoryMapper.mapToDTO(eoInventory);
	}

}
