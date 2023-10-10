package com.brijframework.production.inventory.service.cust;

import java.util.List;

import com.brijframework.production.cust.dto.UICustPreparation;
import com.brijframework.production.cust.entities.EOCustProductionApp;

public interface CustPreparationService {

	UICustPreparation savePreparation(long inventoryAppId, UICustPreparation Preparation);

	UICustPreparation savePreparation(UICustPreparation Preparation);

	UICustPreparation savePreparation(EOCustProductionApp eoInventoryApp, UICustPreparation Preparation);

	UICustPreparation getPreparation(long id);

	List<UICustPreparation> getPreparationList(long inventoryAppId);

	UICustPreparation getPreparation(long inventoryAppId, String typeId);

}
