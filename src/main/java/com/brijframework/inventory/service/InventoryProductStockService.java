package com.brijframework.inventory.service;

import java.util.List;

import com.brijframework.inventory.bean.product.UIProductStock;

public interface InventoryProductStockService {

	UIProductStock saveProductStock(long inventoryAppId, UIProductStock productStock);

	List<UIProductStock> getProductStockListForProduct(long inventoryAppId, long productId);

	List<UIProductStock> getProductStockListForType(long inventoryAppId, String typeId);

}
