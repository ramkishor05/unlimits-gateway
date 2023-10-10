package com.brijframework.production.cust.service;

import java.util.List;

import com.brijframework.production.cust.dto.UICustProductionApp;
import com.brijframework.production.cust.dto.UICustProductionAppDetail;

public interface CustProductionAppService {

	UICustProductionApp saveInventoryApp(UICustProductionApp inventory);

	UICustProductionApp getInventoryApp(long id);

	boolean deleteInventoryApp(long id);

	List<UICustProductionApp> getInventoryAppList();

	UICustProductionAppDetail getInventoryAppDetail(long id);
}
