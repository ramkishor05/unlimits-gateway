package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_UNIT_GROUP;
import static com.brijframework.inventory.contants.Constants.DISPLAY_NAME;
import static com.brijframework.inventory.contants.Constants.EOCUST_UNIT_GROUP;
import static com.brijframework.inventory.contants.Constants.LONG_DESC;
import static com.brijframework.inventory.contants.Constants.NAME;
import static com.brijframework.inventory.contants.Constants.SHORT_DESC;
import static com.brijframework.inventory.contants.Constants.TYPE_ID;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = EOCUST_UNIT_GROUP)
public class EOCustUnitGroup extends EOCustObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = TYPE_ID)
	public String typeId;
	
	@Column(name=NAME)
	public String name;
	
	@Column(name = SHORT_DESC)
	public String shortDesc;
	
	@Column(name = LONG_DESC)
	public String longDesc;
	
	@Column(name = DISPLAY_NAME)
	public String displayName;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustInventoryApp custInventoryApp;

	@OneToMany(mappedBy = CUST_UNIT_GROUP)
	public Set<EOCustUnit> custUnits ;

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

	public Set<EOCustUnit> getCustUnits() {
		return custUnits;
	}

	public void setCustUnits(Set<EOCustUnit> custUnits) {
		this.custUnits = custUnits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EOCustInventoryApp getCustInventoryApp() {
		return custInventoryApp;
	}

	public void setCustInventoryApp(EOCustInventoryApp custInventoryApp) {
		this.custInventoryApp = custInventoryApp;
	}
}