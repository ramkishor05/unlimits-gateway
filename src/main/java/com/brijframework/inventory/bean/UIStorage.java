package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

public class UIStorage implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private float displayOrder;
	private String name;
	private boolean active;
	private String typeId;
	private long inventoryAppId;
	
	private List<UILocation> locationList;

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public Long getInventoryAppId() {
		return inventoryAppId;
	}

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<UILocation> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<UILocation> locationList) {
		this.locationList = locationList;
	}

	public void setInventoryAppId(long inventoryAppId) {
		this.inventoryAppId = inventoryAppId;
	}

}
