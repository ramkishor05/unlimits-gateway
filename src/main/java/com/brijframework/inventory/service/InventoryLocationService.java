package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UILocation;
import com.brijframework.inventory.model.EOInventoryApp;

public interface InventoryLocationService {

	UILocation saveLocation(long inventoryAppId, UILocation Location);

	UILocation saveLocation(UILocation Location);

	UILocation saveLocation(EOInventoryApp eoInventoryApp, UILocation Location);

	UILocation getLocation(long id);

	List<UILocation> getLocationList(long inventoryAppId);

	UILocation getLocation(long inventoryAppId, String typeId);

}
