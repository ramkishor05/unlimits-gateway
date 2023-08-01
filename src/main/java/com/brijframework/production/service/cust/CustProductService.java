package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.rest.cust.CustProductRequest;
import com.brijframework.production.rest.cust.CustProductResponse;

public interface CustProductService {

	CustProductResponse saveProduct(long inventoryAppId, CustProductRequest Product);

	CustProductResponse saveProduct(CustProductRequest Product);

	CustProductResponse saveProduct(EOCustProductionApp eoInventoryApp, CustProductRequest Product);

	CustProductResponse getProduct(long id);

	List<CustProductResponse> getProductList(long inventoryAppId);

	CustProductResponse getProduct(long inventoryAppId, String typeId);

	CustProductResponse updateProduct(long inventoryAppId, CustProductRequest product);

}
