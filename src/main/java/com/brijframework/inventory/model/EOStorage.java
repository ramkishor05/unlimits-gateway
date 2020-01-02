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
public class EOStorage implements Serializable{

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
	
	@ManyToOne
	@JoinColumn(name="InvAppID",nullable=false)
    public EOInventoryApp inventoryApp;
	
	@OneToMany(mappedBy="eoStorage")
	public Set<EOLocation> eoLocationArray=new LinkedHashSet<>();

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

	public Set<EOLocation> getEoLocationArray() {
		return eoLocationArray;
	}

	public void setEoLocationArray(Set<EOLocation> eoLocationArray) {
		this.eoLocationArray = eoLocationArray;
	}
	
	
	
}
