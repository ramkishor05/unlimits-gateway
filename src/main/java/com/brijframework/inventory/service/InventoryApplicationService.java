package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UIInventoryApplication;
import com.brijframework.inventory.bean.UIInventoryApplicationDetail;

public interface InventoryApplicationService {

	UIInventoryApplication saveInventoryApp(UIInventoryApplication inventory);

	UIInventoryApplication getInventoryApp(long id);

	boolean deleteInventoryApp(long id);

	List<UIInventoryApplication> getInventoryAppList();

	UIInventoryApplicationDetail getInventoryAppDetail(long id);
}
