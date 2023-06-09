package com.brijframework.production.dto;

import java.io.Serializable;

public class UIGlobalCategory implements Serializable {

	private static final long serialVersionUID = 1L;
	public long id;
	public String categoryId;
	public String name;
	public String description;
	public String typeId;
	public long categoryGroupId;

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

}
