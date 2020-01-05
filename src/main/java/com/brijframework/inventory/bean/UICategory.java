package com.brijframework.inventory.bean;

import java.io.Serializable;

public class UICategory implements Serializable {

	private static final long serialVersionUID = 1L;
	public long id;
	public String categoryId;
	public String name;
	public String description;
	public String typeId;

	public long categoryGroupId;
	public long inventoryAppId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public long getCategoryGroupId() {
		return categoryGroupId;
	}

	public void setCategoryGroupId(long categoryGroupId) {
		this.categoryGroupId = categoryGroupId;
	}

	public long getInventoryAppId() {
		return inventoryAppId;
	}

	public void setInventoryAppId(long inventoryAppId) {
		this.inventoryAppId = inventoryAppId;
	}

}
