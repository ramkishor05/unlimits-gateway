package com.brijframework.inventory.bean;

import java.io.Serializable;

public class UICountFreq implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String typeId;
	private String name;
	private String description;
	private boolean active;
	private float displayOrder;
	private long inventoryAppId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getInventoryAppId() {
		return inventoryAppId;
	}

	public void setInventoryAppId(long inventoryAppId) {
		this.inventoryAppId = inventoryAppId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public float getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(float displayOrder) {
		this.displayOrder = displayOrder;
	}

}
