package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

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
	
}
