package com.brijframework.production.service.global;

import java.util.List;

import com.brijframework.production.rest.global.GlobalCategoryRequest;
import com.brijframework.production.rest.global.GlobalCategoryResponse;

public interface GlobalCategoryService {

	GlobalCategoryResponse saveCategory(GlobalCategoryRequest globalCategoryRequest);

	GlobalCategoryResponse getCategory(Long id);

	List<GlobalCategoryResponse> getCategoryList();

	List<GlobalCategoryResponse> findAllByType(String typeId);

	boolean deleteCategory(Long id);

}
