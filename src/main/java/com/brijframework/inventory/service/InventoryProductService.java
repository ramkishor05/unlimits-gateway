package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.UIProduct;
import com.brijframework.inventory.model.EOInventoryApp;

public interface InventoryProductService {

	UIProduct saveProduct(long inventoryAppId, UIProduct Product);

	UIProduct saveProduct(UIProduct Product);

	UIProduct saveProduct(EOInventoryApp eoInventoryApp, UIProduct Product);

	UIProduct getProduct(long id);

	List<UIProduct> getProductList(long inventoryAppId);

	UIProduct getProduct(long inventoryAppId, String typeId);

}
