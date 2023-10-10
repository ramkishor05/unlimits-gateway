package com.brijframework.production.inventory.service.cust;

import java.util.List;

import com.brijframework.production.cust.dto.UICustLocation;
import com.brijframework.production.cust.entities.EOCustProductionApp;

public interface CustLocationService {

	UICustLocation saveLocation(long inventoryAppId, UICustLocation Location);

	UICustLocation saveLocation(UICustLocation Location);

	UICustLocation saveLocation(EOCustProductionApp eoInventoryApp, UICustLocation Location);

	UICustLocation getLocation(long id);

	List<UICustLocation> getLocationList(long inventoryAppId);

	UICustLocation getLocation(long inventoryAppId, String typeId);

}
