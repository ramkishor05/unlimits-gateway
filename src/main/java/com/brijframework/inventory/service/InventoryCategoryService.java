package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UICategory;
import com.brijframework.inventory.model.EOInventoryApp;

public interface InventoryCategoryService {

	UICategory saveCategory(long inventoryAppId, UICategory unit);

	UICategory saveCategory(UICategory unit);

	UICategory saveCategory(EOInventoryApp eoInventoryApp, UICategory unit);

	UICategory getCategory(long id);

	List<UICategory> getCategoryList(long inventoryAppId);

	UICategory getCategory(long inventoryAppId, String typeId);

}
