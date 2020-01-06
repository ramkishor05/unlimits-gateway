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
public class EOGlobalStorage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public float displayOrder;
	public String name;
	public boolean active;
	public String typeId;
	
	@ManyToOne
	@JoinColumn(name="InvAppID",nullable=false)
    public EOInventoryApp inventoryApp;
	
	@OneToMany(mappedBy="eoStorage")
	public Set<EOGlobalLocation> eoLocationArray=new LinkedHashSet<>();

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public EOInventoryApp getInventoryApp() {
		return inventoryApp;
	}

	public void setInventoryApp(EOInventoryApp inventoryApp) {
		this.inventoryApp = inventoryApp;
	}

	public Set<EOGlobalLocation> getEoLocationArray() {
		return eoLocationArray;
	}

	public void setEoLocationArray(Set<EOGlobalLocation> eoLocationArray) {
		this.eoLocationArray = eoLocationArray;
	}
	
	
	
}
