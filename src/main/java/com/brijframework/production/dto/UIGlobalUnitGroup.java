package com.brijframework.production.dto;

import java.io.Serializable;
import java.util.List;

public class UIGlobalUnitGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	public long id;
	public String typeId;
	public String shortDesc;
	public String longDesc;
	public String friendlyName;

	public List<UIGlobalUnit> unitArray;

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

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public List<UIGlobalUnit> getUnitArray() {
		return unitArray;
	}

	public void setUnitArray(List<UIGlobalUnit> unitArray) {
		this.unitArray = unitArray;
	}
}
