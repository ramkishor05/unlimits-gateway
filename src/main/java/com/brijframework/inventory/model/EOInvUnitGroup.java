package com.brijframework.inventory.model;

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

@Entity
public class EOInvUnitGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;

	public String typeID;
	public String shortDesc;
	public String longDesc;
	public String friendlyName;
	
	@ManyToOne
	@JoinColumn(name="InvAppID")
    public EOInvApp eoInvApp;
	
	@OneToMany(mappedBy="eoUnitGroup")
	public Set<EOInvUnit> eoUnitArray=new LinkedHashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public EOInvApp getEoInvApp() {
		return eoInvApp;
	}

	public void setEoInvApp(EOInvApp eoInvApp) {
		this.eoInvApp = eoInvApp;
	}

	public Set<EOInvUnit> getEoUnitArray() {
		return eoUnitArray;
	}

	public void setEoUnitArray(Set<EOInvUnit> eoUnitArray) {
		this.eoUnitArray = eoUnitArray;
	}
	
	
}