package com.brijframework.production.cust.controller;
import static com.brijframework.production.contants.Constants.CUST_APP_ID;
import static com.brijframework.production.contants.Constants.TYPE_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.cust.rest.CustCategoryRequest;
import com.brijframework.production.cust.rest.CustCategoryResponse;
import com.brijframework.production.cust.service.CustCategoryService;

@RestController
@RequestMapping("/api/cust/category")
public class CustCategoryController {

	@Autowired
	private CustCategoryService custCategoryService;
	
	@PostMapping
	public CustCategoryResponse addCategory(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody CustCategoryRequest custCategoryRequest) {
		return custCategoryService.saveCategory(custAppId,custCategoryRequest);
	}
	
	@PutMapping
	public CustCategoryResponse updateCategory(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody CustCategoryRequest custCategoryRequest) {
		return custCategoryService.saveCategory(custAppId,custCategoryRequest);
	}
	
	@GetMapping
	public List<CustCategoryResponse> getCategoryList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custCategoryService.getCategoryList(custAppId);
	}
	
	@GetMapping("/{id}")
	public CustCategoryResponse getCategoryList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable("id") Long id) {
		return custCategoryService.getCategory(custAppId,id);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteCategoryList(@RequestHeader(CUST_APP_ID) long custAppId, @PathVariable("id") Long id) {
		return custCategoryService.deleteCategory(custAppId,id);
	}
	
	@GetMapping("/type/{typeId}")
	public List<CustCategoryResponse> getCategoryList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable(TYPE_ID) String typeId) {
		return custCategoryService.findAllByType(custAppId,typeId);
	}
}
