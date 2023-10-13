package com.brijframework.inventory.service.impl;

import java.util.List;

import com.brijframework.inventory.dto.UICustLocation;
import com.brijframework.inventory.entities.EOCustInventoryApp;

public interface CustLocationService {

	UICustLocation saveLocation(long inventoryAppId, UICustLocation Location);

	UICustLocation saveLocation(UICustLocation Location);

	UICustLocation saveLocation(EOCustInventoryApp eoInventoryApp, UICustLocation Location);

	UICustLocation getLocation(long id);

	List<UICustLocation> getLocationList(long inventoryAppId);

	UICustLocation getLocation(long inventoryAppId, String typeId);

}
