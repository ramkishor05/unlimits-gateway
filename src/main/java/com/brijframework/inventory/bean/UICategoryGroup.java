package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.brijframework.inventory.model.EOCategory;
import com.brijframework.inventory.model.EOCategoryGroup;

public class UICategoryGroup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Object id;
	public String categoryID;
	public String name;
	public String description;
	public String typeID;
	
	public List<UICategory> categoryArray;
	
	private EOCategoryGroup categoryGroup;
	
	public UICategoryGroup(EOCategoryGroup categoryGroup) {
		this.categoryGroup=categoryGroup;
		this.fillData();
	}
	
	public List<UICategory> getCategoryArray() {
		if(categoryArray==null) {
			categoryArray=new ArrayList<UICategory>();
		}
		return categoryArray;
	}
	
	
	public void fillData(){
		this.id=this.categoryGroup.id;
		this.categoryID=this.categoryGroup.categoryID;
		this.name=this.categoryGroup.name;
		this.description=this.categoryGroup.description;
		this.typeID=this.categoryGroup.typeID;
		for(EOCategory eoCategory:this.categoryGroup.eoCategoryArray){
			getCategoryArray().add(new UICategory(eoCategory));
		}
	}
}
