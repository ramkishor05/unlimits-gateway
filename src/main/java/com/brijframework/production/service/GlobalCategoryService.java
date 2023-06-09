package com.brijframework.production.service;

import java.util.List;

import com.brijframework.production.dto.UIGlobalCategory;

public interface GlobalCategoryService {

	UIGlobalCategory saveCategory(UIGlobalCategory unit);

	UIGlobalCategory getCategory(Long id);

	List<UIGlobalCategory> getCategoryList();

	List<UIGlobalCategory> findAllByType(String typeId);

}
