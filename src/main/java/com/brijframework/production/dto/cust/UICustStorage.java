package com.brijframework.production.dto.cust;

import java.io.Serializable;

public class UICustStorage implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private float displayOrder;
	private String name;
	private String typeId;
	private long custProductionAppId;

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

	public long getCustProductionAppId() {
		return custProductionAppId;
	}

	public void setCustProductionAppId(long custProductionAppId) {
		this.custProductionAppId = custProductionAppId;
	}

}
