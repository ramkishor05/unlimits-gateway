package com.brijframework.production.service.cust.inv;

import java.util.List;

import com.brijframework.production.dto.cust.UICustLocation;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface CustLocationService {

	UICustLocation saveLocation(long inventoryAppId, UICustLocation Location);

	UICustLocation saveLocation(UICustLocation Location);

	UICustLocation saveLocation(EOCustProductionApp eoInventoryApp, UICustLocation Location);

	UICustLocation getLocation(long id);

	List<UICustLocation> getLocationList(long inventoryAppId);

	UICustLocation getLocation(long inventoryAppId, String typeId);

}
