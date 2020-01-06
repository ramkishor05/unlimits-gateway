package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UIUnit;
import com.brijframework.inventory.bean.UIUnitGroup;
import com.brijframework.inventory.model.EOInventoryApp;
import com.brijframework.inventory.model.global.EOGlobalUnitGroup;

public interface InventoryUnitGroupService {

	UIUnitGroup saveUnitGroup(long inventoryAppId, UIUnitGroup unitGroup);

	UIUnitGroup saveUnitGroup(UIUnitGroup unitGroup);

	UIUnitGroup saveUnitGroup(EOInventoryApp eoInventoryApp, UIUnitGroup unitGroup);

	UIUnitGroup getUnitGroup(long id);

	List<UIUnitGroup> getUnitGroupList(long inventoryAppId);

	UIUnitGroup getUnitGroup(long inventoryAppId, String typeId);

	UIUnit saveUnit(long unitgroupId, UIUnit uiUnit);

	UIUnit getUnit(long unitgroupId, String typeId);

	List<UIUnit> getUnitList(long unitgroupId);

	UIUnit saveUnit(EOGlobalUnitGroup eoUnitGroup, UIUnit unit);

}
