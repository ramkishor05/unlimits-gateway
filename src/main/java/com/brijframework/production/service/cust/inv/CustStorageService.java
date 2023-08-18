package com.brijframework.production.service.cust.inv;

import java.util.List;

import com.brijframework.production.dto.cust.UICustStorage;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface CustStorageService {

	UICustStorage saveStorage(long inventoryAppId, UICustStorage Storage);

	UICustStorage saveStorage(UICustStorage Storage);

	UICustStorage saveStorage(EOCustProductionApp eoInventoryApp, UICustStorage Storage);

	UICustStorage getStorage(long id);

	List<UICustStorage> getStorageList(long inventoryAppId);

	UICustStorage getStorage(long inventoryAppId, String typeId);

}
