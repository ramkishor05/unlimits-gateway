package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UIPreparation;
import com.brijframework.inventory.model.EOInventoryApp;

public interface InventoryPreparationService {

	UIPreparation savePreparation(long inventoryAppId, UIPreparation Preparation);

	UIPreparation savePreparation(UIPreparation Preparation);

	UIPreparation savePreparation(EOInventoryApp eoInventoryApp, UIPreparation Preparation);

	UIPreparation getPreparation(long id);

	List<UIPreparation> getPreparationList(long inventoryAppId);

	UIPreparation getPreparation(long inventoryAppId, String typeId);

}
