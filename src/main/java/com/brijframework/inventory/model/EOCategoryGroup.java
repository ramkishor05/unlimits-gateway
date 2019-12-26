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
public class EOCategoryGroup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public String categoryID;
	public String name;
	public String description;
	public String typeID;
	
	@ManyToOne
	@JoinColumn(name="InvAppID",nullable=false)
    public EOInvUnit eoInvApp;
	
	@OneToMany(mappedBy="eoCategoryGroup")
	public Set<EOCategory> eoCategoryArray=new LinkedHashSet<>();
	

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeID() {
		return typeID;
	}

	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}

	public EOInvUnit getEoInvApp() {
		return eoInvApp;
	}

	public void setEoInvApp(EOInvUnit eoInvApp) {
		this.eoInvApp = eoInvApp;
	}

	public Set<EOCategory> getEoCategoryArray() {
		return eoCategoryArray;
	}

	public void setEoCategoryArray(Set<EOCategory> eoCategoryArray) {
		this.eoCategoryArray = eoCategoryArray;
	}
	
}
