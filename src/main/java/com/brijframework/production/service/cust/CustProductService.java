package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.dto.cust.UICustProduct;
import com.brijframework.production.entities.cust.EOCustProductionApp;

public interface CustProductService {

	UICustProduct saveProduct(long inventoryAppId, UICustProduct Product);

	UICustProduct saveProduct(UICustProduct Product);

	UICustProduct saveProduct(EOCustProductionApp eoInventoryApp, UICustProduct Product);

	UICustProduct getProduct(long id);

	List<UICustProduct> getProductList(long inventoryAppId);

	UICustProduct getProduct(long inventoryAppId, String typeId);

	UICustProduct updateProduct(long inventoryAppId, UICustProduct product);

}
