package com.brijframework.production.dto;

import java.io.Serializable;

public class UIGlobalUnit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public long id;
	public String typeId;
	public String shortDesc;
	public String longDesc;
	public String displayName;
	public String name;
	public long unitGroupId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getUnitGroupId() {
		return unitGroupId;
	}

	public void setUnitGroupId(long unitGroupId) {
		this.unitGroupId = unitGroupId;
	}

}