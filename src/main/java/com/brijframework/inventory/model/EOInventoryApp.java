package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EOInventoryApp implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOCountFreq> eoCountFreqArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOInvUnitGroup> eoUnitGroupArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOProduct> eoProductArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOIngredient> eoIngrArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOPrep> eoPrepArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOCategory> eoCategoryArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOCategoryGroup> eoCategoryGroupArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOStorage> eoStorageArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "inventoryApp")
	public Set<EOLocation> eoLocationArray = new LinkedHashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<EOCountFreq> getEoCountFreqArray() {
		return eoCountFreqArray;
	}

	public void setEoCountFreqArray(Set<EOCountFreq> eoCountFreqArray) {
		this.eoCountFreqArray = eoCountFreqArray;
	}

	public Set<EOInvUnitGroup> getEoUnitGroupArray() {
		return eoUnitGroupArray;
	}

	public void setEoUnitGroupArray(Set<EOInvUnitGroup> eoUnitGroupArray) {
		this.eoUnitGroupArray = eoUnitGroupArray;
	}

	public Set<EOProduct> getEoProductArray() {
		return eoProductArray;
	}

	public void setEoProductArray(Set<EOProduct> eoProductArray) {
		this.eoProductArray = eoProductArray;
	}

	public Set<EOIngredient> getEoIngrArray() {
		return eoIngrArray;
	}

	public void setEoIngrArray(Set<EOIngredient> eoIngrArray) {
		this.eoIngrArray = eoIngrArray;
	}

	public Set<EOPrep> getEoPrepArray() {
		return eoPrepArray;
	}

	public void setEoPrepArray(Set<EOPrep> eoPrepArray) {
		this.eoPrepArray = eoPrepArray;
	}

	public Set<EOCategory> getEoCategoryArray() {
		return eoCategoryArray;
	}

	public void setEoCategoryArray(Set<EOCategory> eoCategoryArray) {
		this.eoCategoryArray = eoCategoryArray;
	}

	public Set<EOCategoryGroup> getEoCategoryGroupArray() {
		return eoCategoryGroupArray;
	}

	public void setEoCategoryGroupArray(Set<EOCategoryGroup> eoCategoryGroupArray) {
		this.eoCategoryGroupArray = eoCategoryGroupArray;
	}

	public Set<EOStorage> getEoStorageArray() {
		return eoStorageArray;
	}

	public void setEoStorageArray(Set<EOStorage> eoStorageArray) {
		this.eoStorageArray = eoStorageArray;
	}

	public Set<EOLocation> getEoLocationArray() {
		return eoLocationArray;
	}

	public void setEoLocationArray(Set<EOLocation> eoLocationArray) {
		this.eoLocationArray = eoLocationArray;
	}

	

}
