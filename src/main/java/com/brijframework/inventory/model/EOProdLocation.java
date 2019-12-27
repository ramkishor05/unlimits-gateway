package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EOProdLocation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
    
	public float displayOrder;
	@ManyToOne
	@JoinColumn(name="ProductID")
	public EOProduct eoProduct;
	
	@ManyToOne
	@JoinColumn(name="LocationID")
	public EOLocation eoLocation;

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

	public EOProduct getEoProduct() {
		return eoProduct;
	}

	public void setEoProduct(EOProduct eoProduct) {
		this.eoProduct = eoProduct;
	}

	public EOLocation getEoLocation() {
		return eoLocation;
	}

	public void setEoLocation(EOLocation eoLocation) {
		this.eoLocation = eoLocation;
	}
	
	
}