package com.brijframework.production.inventory.service.cust;

import java.util.List;

import com.brijframework.production.cust.dto.UICustStorage;
import com.brijframework.production.cust.entities.EOCustProductionApp;

public interface CustStorageService {

	UICustStorage saveStorage(long inventoryAppId, UICustStorage Storage);

	UICustStorage saveStorage(UICustStorage Storage);

	UICustStorage saveStorage(EOCustProductionApp eoInventoryApp, UICustStorage Storage);

	UICustStorage getStorage(long id);

	List<UICustStorage> getStorageList(long inventoryAppId);

	UICustStorage getStorage(long inventoryAppId, String typeId);

}
