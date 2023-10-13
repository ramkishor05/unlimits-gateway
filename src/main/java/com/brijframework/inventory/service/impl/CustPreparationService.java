package com.brijframework.inventory.service.impl;

import java.util.List;

import com.brijframework.inventory.dto.UICustPreparation;
import com.brijframework.inventory.entities.EOCustInventoryApp;

public interface CustPreparationService {

	UICustPreparation savePreparation(long inventoryAppId, UICustPreparation Preparation);

	UICustPreparation savePreparation(UICustPreparation Preparation);

	UICustPreparation savePreparation(EOCustInventoryApp eoInventoryApp, UICustPreparation Preparation);

	UICustPreparation getPreparation(long id);

	List<UICustPreparation> getPreparationList(long inventoryAppId);

	UICustPreparation getPreparation(long inventoryAppId, String typeId);

}
