package com.brijframework.production.global.service;

import java.util.List;

import com.brijframework.production.contants.DataStatus;
import com.brijframework.production.global.dto.UIGlobalCategoryGroup;

public interface GlobalCategoryGroupService {

	UIGlobalCategoryGroup saveCategoryGroup(UIGlobalCategoryGroup unitGroup);

	UIGlobalCategoryGroup getCategoryGroup(long id);

	List<UIGlobalCategoryGroup> getCategoryGroupList();

	List<UIGlobalCategoryGroup> getCategoryGroup( String typeId);

	List<UIGlobalCategoryGroup> getCategoryGroupList(DataStatus dataStatus);

	boolean deleteCategoryGroup(Long id);

}
