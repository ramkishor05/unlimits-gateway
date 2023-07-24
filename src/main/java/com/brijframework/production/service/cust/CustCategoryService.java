package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.dto.UICustCategory;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface CustCategoryService {

	UICustCategory saveCategory(long inventoryAppId, UICustCategory uiCustCategory);

	UICustCategory saveCategory(UICustCategory uiCustCategory);

	UICustCategory saveCategory(EOCustProductionApp eoInventoryApp, UICustCategory uiCustCategory);

	UICustCategory getCategory(long id);

	List<UICustCategory> getCategoryList(long inventoryAppId);

	UICustCategory getCategory(long inventoryAppId, String typeId);

}
