package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UIStorage;
import com.brijframework.inventory.model.EOInventoryApp;

public interface InventoryStorageService {

	UIStorage saveStorage(long inventoryAppId, UIStorage Storage);

	UIStorage saveStorage(UIStorage Storage);

	UIStorage saveStorage(EOInventoryApp eoInventoryApp, UIStorage Storage);

	UIStorage getStorage(long id);

	List<UIStorage> getStorageList(long inventoryAppId);

	UIStorage getStorage(long inventoryAppId, String typeId);

}
