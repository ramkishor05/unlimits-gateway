package com.brijframework.production.entities;

import static com.brijframework.production.contants.Constants.DISPLAY_NAME;
import static com.brijframework.production.contants.Constants.EOGLOBAL_MEDIA_DETAIL;
import static com.brijframework.production.contants.Constants.GROUP_ID;
import static com.brijframework.production.contants.Constants.LONG_DESC;
import static com.brijframework.production.contants.Constants.NAME;
import static com.brijframework.production.contants.Constants.SHORT_DESC;
import static com.brijframework.production.contants.Constants.TYPE_ID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOGLOBAL_MEDIA_DETAIL, uniqueConstraints = { @UniqueConstraint(columnNames = {GROUP_ID, NAME }) })
public class EOGlobalUnit extends EOEntityObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name=TYPE_ID)
	public String typeId;
	
	@Column(name=NAME)
	public String name;
	
	@Column(name=SHORT_DESC)
	public String shortDesc;
	
	@Column(name=LONG_DESC)
	public String longDesc;
	
	@Column(name=DISPLAY_NAME)
	public String dispayName;
		
	@ManyToOne
	@JoinColumn(name=GROUP_ID)
	public EOGlobalUnitGroup  unitGroup;

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

	public String getDispayName() {
		return dispayName;
	}

	public void setDispayName(String dispayName) {
		this.dispayName = dispayName;
	}

	public EOGlobalUnitGroup getUnitGroup() {
		return unitGroup;
	}

	public void setUnitGroup(EOGlobalUnitGroup unitGroup) {
		this.unitGroup = unitGroup;
	}
}
