package com.brijframework.inventory.bean;

import java.util.ArrayList;
import java.util.List;

import com.brijframework.inventory.model.EOCategory;
import com.brijframework.inventory.model.EOCategoryGroup;
import com.brijframework.inventory.model.EOInvApp;

public class UICategorySummary {

	public List<UICategoryGroup> categoryGroups;
	
	public List<UICategory> categoryList;
	
	private EOInvApp eoInvApp;
	
	public UICategorySummary(EOInvApp eoInvApp) {
		this.eoInvApp=eoInvApp;
		this.fillData();
	}
	
	private void fillData() {
		for(EOCategory eoCategory:eoInvApp.eoCategoryArray){
			categoryList.add(new UICategory(eoCategory));
		}
		for(EOCategoryGroup eoCategory:eoInvApp.eoCategoryGroupArray){
			categoryGroups.add(new UICategoryGroup(eoCategory));
		}
	}

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

	public EOInvApp getEoInvApp() {
		return eoInvApp;
	}

	public void setEoInvApp(EOInvApp eoInvApp) {
		this.eoInvApp = eoInvApp;
	}
	
	
}
