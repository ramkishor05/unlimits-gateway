package com.brijframework.inventory.dto;

import java.io.Serializable;

public class UICustStorage implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private float displayOrder;
	private String name;
	private String typeId;
	private long custInventoryAppId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(float displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public long getCustInventoryAppId() {
		return custInventoryAppId;
	}

	public void setCustInventoryAppId(long custInventoryAppId) {
		this.custInventoryAppId = custInventoryAppId;
	}

}
