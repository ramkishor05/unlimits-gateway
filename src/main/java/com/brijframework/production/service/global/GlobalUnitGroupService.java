package com.brijframework.production.service.global;

import java.util.List;

import com.brijframework.production.dto.global.UIGlobalUnitGroup;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface GlobalUnitGroupService {

	UIGlobalUnitGroup saveUnitGroup(long inventoryAppId, UIGlobalUnitGroup unitGroup);

	UIGlobalUnitGroup saveUnitGroup(UIGlobalUnitGroup unitGroup);

	UIGlobalUnitGroup saveUnitGroup(EOCustProductionApp eoInventoryApp, UIGlobalUnitGroup unitGroup);

	UIGlobalUnitGroup getUnitGroup(long id);

	List<UIGlobalUnitGroup> getUnitGroupList(long inventoryAppId);

	UIGlobalUnitGroup getUnitGroup(long inventoryAppId, String typeId);

}
