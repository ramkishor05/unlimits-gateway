package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

import com.brijframework.inventory.model.EOInvUnit;
import com.brijframework.inventory.model.EOInvUnitGroup;

public class UIUnitGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	public long uniqueID;
	public String typeID;
	public String shortDesc;
	public String longDesc;
	public String friendlyName;

	public List<UIRptUnit> unitArray;

	private EOInvUnitGroup invUnitGroup;

	public UIUnitGroup(EOInvUnitGroup invUnitGroup) {
		this.invUnitGroup = invUnitGroup;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	}

	public String getTypeID() {
		return typeID;
	}

	public void setTypeID(String typeID) {
		this.typeID = typeID;
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

	public List<UIRptUnit> getUnitArray() {
		return unitArray;
	}

	public void setUnitArray(List<UIRptUnit> unitArray) {
		this.unitArray = unitArray;
	}

	public EOInvUnitGroup getInvUnitGroup() {
		return invUnitGroup;
	}

	public void setInvUnitGroup(EOInvUnitGroup invUnitGroup) {
		this.invUnitGroup = invUnitGroup;
	}
	
	
	
}

class UIRptUnit implements Serializable {
	private static final long serialVersionUID = 1L;
	public long uniqueID;
	public String typeID;
	public String shortDesc;
	public String longDesc;
	public String friendlyName;

	EOInvUnit eoInvUnit;
	
	public UIRptUnit(EOInvUnit eoInvUnit) {
		this.eoInvUnit = eoInvUnit;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	}

	public String getTypeID() {
		return typeID;
	}

	public void setTypeID(String typeID) {
		this.typeID = typeID;
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

	public EOInvUnit getEoInvUnit() {
		return eoInvUnit;
	}

	public void setEoInvUnit(EOInvUnit eoInvUnit) {
		this.eoInvUnit = eoInvUnit;
	}
	
	

}