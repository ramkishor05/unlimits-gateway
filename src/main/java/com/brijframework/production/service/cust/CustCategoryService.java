package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.dto.UICategory;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface CustCategoryService {

	UICategory saveCategory(long inventoryAppId, UICategory unit);

	UICategory saveCategory(UICategory unit);

	UICategory saveCategory(EOCustProductionApp eoInventoryApp, UICategory unit);

	UICategory getCategory(long id);

	List<UICategory> getCategoryList(long inventoryAppId);

	UICategory getCategory(long inventoryAppId, String typeId);

}
