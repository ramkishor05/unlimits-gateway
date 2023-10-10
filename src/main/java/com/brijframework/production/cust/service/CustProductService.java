package com.brijframework.production.cust.service;

import java.util.List;

import com.brijframework.production.cust.entities.EOCustProductionApp;
import com.brijframework.production.cust.rest.CustProductRequest;
import com.brijframework.production.cust.rest.CustProductResponse;

public interface CustProductService {

	CustProductResponse saveProduct(long inventoryAppId, CustProductRequest Product);

	CustProductResponse saveProduct(CustProductRequest Product);

	CustProductResponse saveProduct(EOCustProductionApp eoInventoryApp, CustProductRequest Product);

	CustProductResponse getProduct(long id);

	List<CustProductResponse> getProductList(long inventoryAppId);

	CustProductResponse getProduct(long inventoryAppId, String typeId);

	CustProductResponse updateProduct(long inventoryAppId, CustProductRequest product);

}
