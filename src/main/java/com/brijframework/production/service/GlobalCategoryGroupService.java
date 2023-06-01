package com.brijframework.production.service;

import java.util.List;

import com.brijframework.production.dto.UIGlobalCategoryGroup;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface GlobalCategoryGroupService {

	UIGlobalCategoryGroup saveCategoryGroup(long inventoryAppId, UIGlobalCategoryGroup unitGroup);

	UIGlobalCategoryGroup saveCategoryGroup(UIGlobalCategoryGroup unitGroup);

	UIGlobalCategoryGroup saveCategoryGroup(EOCustProductionApp eoInventoryApp, UIGlobalCategoryGroup unitGroup);

	UIGlobalCategoryGroup getCategoryGroup(long id);

	List<UIGlobalCategoryGroup> getCategoryGroupList(long inventoryAppId);

	UIGlobalCategoryGroup getCategoryGroup(long inventoryAppId, String typeId);

}
