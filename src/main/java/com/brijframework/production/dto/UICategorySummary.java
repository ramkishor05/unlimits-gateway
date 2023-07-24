package com.brijframework.production.dto;

import java.util.ArrayList;
import java.util.List;

import com.brijframework.production.dto.global.UIGlobalCategoryGroup;

public class UICategorySummary {

	public List<UIGlobalCategoryGroup> categoryGroups;
	
	public List<UICustCategory> categoryList;


	public List<UIGlobalCategoryGroup> getCategoryGroups() {
		if(categoryGroups==null) {
			categoryGroups=new ArrayList<>();
		}
		return categoryGroups;
	}

	public void setCategoryGroups(List<UIGlobalCategoryGroup> categoryGroups) {
		this.categoryGroups = categoryGroups;
	}

	public List<UICustCategory> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<UICustCategory> categoryList) {
		this.categoryList = categoryList;
	}

}
