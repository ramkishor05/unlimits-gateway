package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UIInventoryManager;
import com.brijframework.inventory.contants.CountFreq;

public interface InventoryManagerService {

	UIInventoryManager saveInventory(UIInventoryManager inventory);

	UIInventoryManager saveInventory(CountFreq countFreq);
	
	UIInventoryManager getInventory(long id);

	boolean deleteInventory(long id);

	List<UIInventoryManager> getInventoryList(CountFreq countFreq);
	
	List<UIInventoryManager> getInventoryList();

}
