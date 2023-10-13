package com.brijframework.inventory.service.impl;

import java.util.List;

import com.brijframework.inventory.dto.UICustStorage;
import com.brijframework.inventory.entities.EOCustInventoryApp;

public interface CustStorageService {

	UICustStorage saveStorage(long inventoryAppId, UICustStorage Storage);

	UICustStorage saveStorage(UICustStorage Storage);

	UICustStorage saveStorage(EOCustInventoryApp eoInventoryApp, UICustStorage Storage);

	UICustStorage getStorage(long id);

	List<UICustStorage> getStorageList(long inventoryAppId);

	UICustStorage getStorage(long inventoryAppId, String typeId);

}
