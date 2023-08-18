package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.rest.cust.CustCategoryRequest;
import com.brijframework.production.rest.cust.CustCategoryResponse;

public interface CustCategoryService {

	CustCategoryResponse saveCategory(long custAppId, CustCategoryRequest custCategoryRequest);

	CustCategoryResponse saveCategory(EOCustProductionApp eoCustProductionApp, CustCategoryRequest uiCustCategory);

	CustCategoryResponse getCategory(long custAppId, long id);

	List<CustCategoryResponse> getCategoryList(long custAppId);

	boolean deleteCategory(long custAppId, Long id);

	List<CustCategoryResponse> findAllByType(long custAppId, String typeId);

}
