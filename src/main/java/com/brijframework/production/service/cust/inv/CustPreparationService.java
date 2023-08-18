package com.brijframework.production.service.cust.inv;

import java.util.List;

import com.brijframework.production.dto.cust.UICustPreparation;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface CustPreparationService {

	UICustPreparation savePreparation(long inventoryAppId, UICustPreparation Preparation);

	UICustPreparation savePreparation(UICustPreparation Preparation);

	UICustPreparation savePreparation(EOCustProductionApp eoInventoryApp, UICustPreparation Preparation);

	UICustPreparation getPreparation(long id);

	List<UICustPreparation> getPreparationList(long inventoryAppId);

	UICustPreparation getPreparation(long inventoryAppId, String typeId);

}
