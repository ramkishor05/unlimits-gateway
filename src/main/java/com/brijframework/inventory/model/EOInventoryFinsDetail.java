package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class EOInventoryFinsDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public float closingCount; // count of this inventory
	public float openingCount;
	public float inTransitQnt;// ordered but not received exploded into ingredient during inventory cycle
	public float delvCount; // deliveries exploded into ingredient during inventory cycle
	public float theoCount; // menu mix exploded into ingredient during inventory cycle
	public float openingCost;
	public float delvCost; // amount paid for delivery during this cycle
	public float lastUnitCost; // base Unit Cost-- if there are deliveries during this inventory cycle use the
								// latest or else use EOSiteIngrPrep.lastCost

	@ManyToOne
	@JoinColumn(name = "INVENTORY_ID")
	private EOInventoryManager inventory;

	@OneToOne
	@JoinColumn(name = "INGREDIENT_ID")
	private EOInventoryIngredient ingredient;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
