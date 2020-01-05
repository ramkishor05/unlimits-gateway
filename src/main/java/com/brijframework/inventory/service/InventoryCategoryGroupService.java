package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UICategoryGroup;
import com.brijframework.inventory.model.EOInventoryApp;

public interface InventoryCategoryGroupService {

	UICategoryGroup saveCategoryGroup(long inventoryAppId, UICategoryGroup unitGroup);

	UICategoryGroup saveCategoryGroup(UICategoryGroup unitGroup);

	UICategoryGroup saveCategoryGroup(EOInventoryApp eoInventoryApp, UICategoryGroup unitGroup);

	UICategoryGroup getCategoryGroup(long id);

	List<UICategoryGroup> getCategoryGroupList(long inventoryAppId);

	UICategoryGroup getCategoryGroup(long inventoryAppId, String typeId);

}
