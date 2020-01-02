package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class EOIngrLocation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
    
	public float displayOrder;
	
	@ManyToOne
	@JoinColumn(name="INGR_ID")
	public EOIngredient ingredient;
	
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	public EOLocation location;

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

	public EOIngredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(EOIngredient ingredient) {
		this.ingredient = ingredient;
	}

	public EOLocation getLocation() {
		return location;
	}

	public void setLocation(EOLocation location) {
		this.location = location;
	}

	
}

