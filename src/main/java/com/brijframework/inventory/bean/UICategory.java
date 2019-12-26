package com.brijframework.inventory.bean;

import java.io.Serializable;

import com.brijframework.inventory.model.EOCategory;

public  class UICategory implements Serializable{

	

	private static final long serialVersionUID = 1L;
	public long id;
	public String categoryID;
	public String name;
	public String description;
	public String typeID;
	
	public String categoryGroup;
	public long eoCategoryGroup;
	

	private EOCategory eoCategory;
	public UICategory(EOCategory eoCategory) {
		this.eoCategory=eoCategory;
		this.fillData();
	}
	
	private void fillData() {
		this.id=this.eoCategory.id;
		this.categoryID=this.eoCategory.categoryID;
		this.name=this.eoCategory.name;
		this.description=this.eoCategory.description;
		this.typeID=this.eoCategory.typeID;
		if(this.eoCategory.eoCategoryGroup!=null){
			this.eoCategoryGroup=this.eoCategory.eoCategoryGroup.id;
			this.categoryGroup=this.eoCategory.eoCategoryGroup.name;
		}
	}
	
}
