package com.brijframework.production.global.service;

import java.util.List;

import com.brijframework.production.global.rest.GlobalCategoryRequest;
import com.brijframework.production.global.rest.GlobalCategoryResponse;

public interface GlobalCategoryService {

	GlobalCategoryResponse saveCategory(GlobalCategoryRequest globalCategoryRequest);

	GlobalCategoryResponse getCategory(Long id);

	List<GlobalCategoryResponse> getCategoryList();

	List<GlobalCategoryResponse> findAllByType(String typeId);

	boolean deleteCategory(Long id);

}
