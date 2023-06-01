package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.dto.cust.UICustProductionApp;
import com.brijframework.production.dto.cust.UICustProductionAppDetail;

public interface CustProductionAppService {

	UICustProductionApp saveInventoryApp(UICustProductionApp inventory);

	UICustProductionApp getInventoryApp(long id);

	boolean deleteInventoryApp(long id);

	List<UICustProductionApp> getInventoryAppList();

	UICustProductionAppDetail getInventoryAppDetail(long id);
}
