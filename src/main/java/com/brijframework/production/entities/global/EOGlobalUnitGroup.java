package com.brijframework.production.entities.global;

import static com.brijframework.production.contants.Constants.DISPLAY_NAME;
import static com.brijframework.production.contants.Constants.EOGLOBAL_UNIT_GROUP;
import static com.brijframework.production.contants.Constants.LONG_DESC;
import static com.brijframework.production.contants.Constants.NAME;
import static com.brijframework.production.contants.Constants.SHORT_DESC;
import static com.brijframework.production.contants.Constants.TYPE_ID;
import static com.brijframework.production.contants.Constants.UNIT_GROUP;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.brijframework.production.entities.EOEntityObject;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOGLOBAL_UNIT_GROUP, uniqueConstraints = { @UniqueConstraint(columnNames = { NAME }) })
public class EOGlobalUnitGroup extends EOEntityObject {

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

	@OneToMany(mappedBy = UNIT_GROUP)
	public Set<EOGlobalUnit> globalUnits;

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

	public Set<EOGlobalUnit> getGlobalUnits() {
		return globalUnits;
	}

	public void setGlobalUnits(Set<EOGlobalUnit> globalUnits) {
		this.globalUnits = globalUnits;
	}


}