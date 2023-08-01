package com.brijframework.production.service.cust;

import java.time.LocalDateTime;
import java.util.List;

import com.brijframework.production.rest.cust.CustProductSaleRequest;
import com.brijframework.production.rest.cust.CustProductSaleResponse;

public interface CustProductSaleService {

	CustProductSaleResponse saveProductSale(long custAppId, CustProductSaleRequest custProductSaleRequest);

	CustProductSaleResponse updateProductSale(long custAppId, CustProductSaleRequest custProductSaleRequest);

	List<CustProductSaleResponse> getProductSaleList(long custAppId);

	CustProductSaleResponse getProductSale(long custAppId, String typeId);

	List<CustProductSaleResponse> filterProductSaleList(long custAppId, LocalDateTime fromDate, LocalDateTime toDate);

}
