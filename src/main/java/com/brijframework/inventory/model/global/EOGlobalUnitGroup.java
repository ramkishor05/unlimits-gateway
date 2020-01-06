package com.brijframework.inventory.model.global;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.brijframework.inventory.model.EOInventoryApp;

@Entity
public class EOGlobalUnitGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	public String typeId;
	public String shortDesc;
	public String longDesc;
	public String friendlyName;

	@ManyToOne
	@JoinColumn(name = "INV_APP_ID")
	public EOInventoryApp inventoryApp;

	@OneToMany(mappedBy = "unitGroup")
	public Set<EOGlobalUnit> unitArray = new LinkedHashSet<>();

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

	public EOInventoryApp getInventoryApp() {
		return inventoryApp;
	}

	public void setInventoryApp(EOInventoryApp inventoryApp) {
		this.inventoryApp = inventoryApp;
	}

	public Set<EOGlobalUnit> getUnitArray() {
		return unitArray;
	}

	public void setUnitArray(Set<EOGlobalUnit> eoUnitArray) {
		this.unitArray = eoUnitArray;
	}

}