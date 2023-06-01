package com.brijframework.production.dto;

import java.util.ArrayList;
import java.util.List;

public class UICategorySummary {

	public List<UIGlobalCategoryGroup> categoryGroups;
	
	public List<UICategory> categoryList;


	public List<UIGlobalCategoryGroup> getCategoryGroups() {
		if(categoryGroups==null) {
			categoryGroups=new ArrayList<>();
		}
		return categoryGroups;
	}

	public void setCategoryGroups(List<UIGlobalCategoryGroup> categoryGroups) {
		this.categoryGroups = categoryGroups;
	}

	public List<UICategory> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<UICategory> categoryList) {
		this.categoryList = categoryList;
	}

}
