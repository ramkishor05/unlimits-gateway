package com.brijframework.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class EOInventoryItemDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	// quantities measured in different units like cases, packs, base units and reporting units
	public float caseQnt; // In case of Prep this would be batch
	public float packQnt;
	public float rptQnt;
	public float baseQnt;
	public float lastUnitCost;
	
	@ManyToOne
	@JoinColumn(name="INVENTORY_ID")
	EOInventoryManager inventory;
	
	@OneToOne
	@JoinColumn(name="INGREDIENT_ID")
	EOInventoryIngredient ingredient;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getCaseQnt() {
		return caseQnt;
	}

	public void setCaseQnt(float caseQnt) {
		this.caseQnt = caseQnt;
	}

	public float getPackQnt() {
		return packQnt;
	}

	public void setPackQnt(float packQnt) {
		this.packQnt = packQnt;
	}

	public float getRptQnt() {
		return rptQnt;
	}

	public void setRptQnt(float rptQnt) {
		this.rptQnt = rptQnt;
	}

	public float getBaseQnt() {
		return baseQnt;
	}

	public void setBaseQnt(float baseQnt) {
		this.baseQnt = baseQnt;
	}

	public float getLastUnitCost() {
		return lastUnitCost;
	}

	public void setLastUnitCost(float lastUnitCost) {
		this.lastUnitCost = lastUnitCost;
	}

	public EOInventoryManager getInventory() {
		return inventory;
	}

	public void setInventory(EOInventoryManager inventory) {
		this.inventory = inventory;
	}

	public EOInventoryIngredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(EOInventoryIngredient ingredient) {
		this.ingredient = ingredient;
	}
	
	
	
}
