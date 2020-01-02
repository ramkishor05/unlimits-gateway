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
public class EOLocation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	public String idenNo;
	public float displayOrder;
	public String name;
	public boolean active;

	@ManyToOne
	@JoinColumn(name = "InvAppID", nullable = false)
	public EOInventoryApp inventoryApp;

	@ManyToOne
	@JoinColumn(name = "StorageID", nullable = false)
	public EOStorage eoStorage;

	@OneToMany(mappedBy = "location")
	public Set<EOIngrLocation> ingrLocations = new LinkedHashSet<>();

	@OneToMany(mappedBy = "location")
	public Set<EOPrepLocation> prepLocations = new LinkedHashSet<>();

	@OneToMany(mappedBy = "location")
	public Set<EOProdLocation> prodLocations = new LinkedHashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
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

	public EOStorage getEoStorage() {
		return eoStorage;
	}

	public void setEoStorage(EOStorage eoStorage) {
		this.eoStorage = eoStorage;
	}

	public Set<EOIngrLocation> getIngrLocations() {
		return ingrLocations;
	}

	public void setIngrLocations(Set<EOIngrLocation> ingrLocations) {
		this.ingrLocations = ingrLocations;
	}

	public Set<EOPrepLocation> getPrepLocations() {
		return prepLocations;
	}

	public void setPrepLocations(Set<EOPrepLocation> prepLocations) {
		this.prepLocations = prepLocations;
	}

	public Set<EOProdLocation> getProdLocations() {
		return prodLocations;
	}

	public void setProdLocations(Set<EOProdLocation> prodLocations) {
		this.prodLocations = prodLocations;
	}

	

}
