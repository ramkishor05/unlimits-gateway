package com.brijframework.inventory.bean;

import java.util.ArrayList;
import java.util.List;

public class UICategorySummary {

	public List<UICategoryGroup> categoryGroups;
	
	public List<UICategory> categoryList;


	public List<UICategoryGroup> getCategoryGroups() {
		if(categoryGroups==null) {
			categoryGroups=new ArrayList<>();
		}
		return categoryGroups;
	}

	public void setCategoryGroups(List<UICategoryGroup> categoryGroups) {
		this.categoryGroups = categoryGroups;
	}

	public List<UICategory> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<UICategory> categoryList) {
		this.categoryList = categoryList;
	}

}
