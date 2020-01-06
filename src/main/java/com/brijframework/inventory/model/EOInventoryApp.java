package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.brijframework.inventory.model.global.EOGlobalCategory;
import com.brijframework.inventory.model.global.EOGlobalCategoryGroup;
import com.brijframework.inventory.model.global.EOGlobalCountFreq;
import com.brijframework.inventory.model.global.EOGlobalIngredient;
import com.brijframework.inventory.model.global.EOGlobalLocation;
import com.brijframework.inventory.model.global.EOGlobalPreparation;
import com.brijframework.inventory.model.global.EOGlobalProduct;
import com.brijframework.inventory.model.global.EOGlobalStorage;
import com.brijframework.inventory.model.global.EOGlobalUnitGroup;

@Entity
public class EOInventoryApp implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "APP_ID", nullable = false)
	private long appid;

	@Column(name = "CUST_ID", nullable = false)
	private long custId;

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalCountFreq> countFreqs = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalUnitGroup> unitGroups = new LinkedHashSet<>();
	
	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalCategoryGroup> categoryGroups = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalStorage> storages = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalCategory> categories = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalLocation> locations = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalProduct> products = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalIngredient> ingredients = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOGlobalPreparation> preps = new LinkedHashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAppid() {
		return appid;
	}

	public void setAppid(long appid) {
		this.appid = appid;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public Set<EOGlobalCountFreq> getCountFreqs() {
		return countFreqs;
	}

	public void setCountFreqs(Set<EOGlobalCountFreq> countFreqs) {
		this.countFreqs = countFreqs;
	}

	public Set<EOGlobalUnitGroup> getUnitGroups() {
		return unitGroups;
	}

	public void setUnitGroups(Set<EOGlobalUnitGroup> unitGroups) {
		this.unitGroups = unitGroups;
	}

	public Set<EOGlobalProduct> getProducts() {
		return products;
	}

	public void setProducts(Set<EOGlobalProduct> products) {
		this.products = products;
	}

	public Set<EOGlobalIngredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<EOGlobalIngredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Set<EOGlobalPreparation> getPreps() {
		return preps;
	}

	public void setPreps(Set<EOGlobalPreparation> preps) {
		this.preps = preps;
	}

	public Set<EOGlobalCategory> getCategories() {
		return categories;
	}

	public void setCategories(Set<EOGlobalCategory> categories) {
		this.categories = categories;
	}

	public Set<EOGlobalCategoryGroup> getCategoryGroups() {
		return categoryGroups;
	}

	public void setCategoryGroups(Set<EOGlobalCategoryGroup> categoryGroups) {
		this.categoryGroups = categoryGroups;
	}

	public Set<EOGlobalStorage> getStorages() {
		return storages;
	}

	public void setStorages(Set<EOGlobalStorage> storages) {
		this.storages = storages;
	}

	public Set<EOGlobalLocation> getLocations() {
		return locations;
	}

	public void setLocations(Set<EOGlobalLocation> locations) {
		this.locations = locations;
	}

}
