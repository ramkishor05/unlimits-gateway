package com.brijframework.production.service.global;

import java.util.List;

import com.brijframework.production.dto.global.UIGlobalCategoryGroup;

public interface GlobalCategoryGroupService {

	UIGlobalCategoryGroup saveCategoryGroup(UIGlobalCategoryGroup unitGroup);

	UIGlobalCategoryGroup getCategoryGroup(long id);

	List<UIGlobalCategoryGroup> getCategoryGroupList();

	UIGlobalCategoryGroup getCategoryGroup( String typeId);

}
