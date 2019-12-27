package com.brijframework.inventory.bean;

import java.io.Serializable;

public  class UICategory implements Serializable{

	

	private static final long serialVersionUID = 1L;
	public long id;
	public String categoryID;
	public String name;
	public String description;
	public String typeID;
	
	public String categoryGroup;
	public long eoCategoryGroup;
	
}
