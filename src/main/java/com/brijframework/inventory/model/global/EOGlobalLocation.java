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
public class EOGlobalLocation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	public String idenNo;
	public float displayOrder;
	public String name;
	public boolean active;
	public String typeId;

	@ManyToOne
	@JoinColumn(name = "InvAppID", nullable = false)
	public EOInventoryApp inventoryApp;

	@ManyToOne
	@JoinColumn(name = "StorageID", nullable = false)
	public EOGlobalStorage eoStorage;

	@OneToMany(mappedBy = "location")
	public Set<EOGlobalIngredientLocation> ingrLocations = new LinkedHashSet<>();

	@OneToMany(mappedBy = "location")
	public Set<EOGlobalPreparationLocation> prepLocations = new LinkedHashSet<>();

	@OneToMany(mappedBy = "location")
	public Set<EOGlobalProductLocation> prodLocations = new LinkedHashSet<>();

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

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public EOInventoryApp getInventoryApp() {
		return inventoryApp;
	}

	public void setInventoryApp(EOInventoryApp inventoryApp) {
		this.inventoryApp = inventoryApp;
	}

	public EOGlobalStorage getEoStorage() {
		return eoStorage;
	}

	public void setEoStorage(EOGlobalStorage eoStorage) {
		this.eoStorage = eoStorage;
	}

	public Set<EOGlobalIngredientLocation> getIngrLocations() {
		return ingrLocations;
	}

	public void setIngrLocations(Set<EOGlobalIngredientLocation> ingrLocations) {
		this.ingrLocations = ingrLocations;
	}

	public Set<EOGlobalPreparationLocation> getPrepLocations() {
		return prepLocations;
	}

	public void setPrepLocations(Set<EOGlobalPreparationLocation> prepLocations) {
		this.prepLocations = prepLocations;
	}

	public Set<EOGlobalProductLocation> getProdLocations() {
		return prodLocations;
	}

	public void setProdLocations(Set<EOGlobalProductLocation> prodLocations) {
		this.prodLocations = prodLocations;
	}

}
