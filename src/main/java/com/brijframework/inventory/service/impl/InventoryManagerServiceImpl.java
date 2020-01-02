package com.brijframework.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.bean.UIInventoryManager;
import com.brijframework.inventory.contants.CountFreq;
import com.brijframework.inventory.mapper.InventoryManagerMapper;
import com.brijframework.inventory.model.EOInventoryManager;
import com.brijframework.inventory.repository.InventoryManagerRepository;
import com.brijframework.inventory.service.InventoryManagerService;

@Service
public  class InventoryManagerServiceImpl implements InventoryManagerService{

	@Autowired
	private InventoryManagerMapper inventoryManagerMapper;

	@Autowired
	private InventoryManagerRepository inventoryManagerRepository;
	
	@Override
	public UIInventoryManager saveInventory(UIInventoryManager inventory) {
		EOInventoryManager eoInventory = inventoryManagerMapper.mapToDAO(inventory);
		/*EOInventory lastInventory = inventoryRepository.findFirstByOrderByBusiDateAscAndCountFreqId(busiDate, inventory.getCountFreq());
		eoInventory.setOpeningInv(lastInventory);*/
		return inventoryManagerMapper.mapToDTO(eoInventory);
	}

	public List<UIInventoryManager> getInventoryList() {
		return inventoryManagerMapper.mapToDTO(inventoryManagerRepository.findAll());
	}
	
	public UIInventoryManager getInventory(long id) {
		return inventoryManagerMapper.mapToDTO(inventoryManagerRepository.findById(id).orElse(null));
	}
	
	public boolean deleteInventory(long id) {
		inventoryManagerRepository.deleteById(id);
		return true;
	}

	@Override
	public UIInventoryManager saveInventory(CountFreq countFreq) {
		return null;
	}

	@Override
	public List<UIInventoryManager> getInventoryList(CountFreq countFreq) {
		// TODO Auto-generated method stub
		return null;
	}
}
