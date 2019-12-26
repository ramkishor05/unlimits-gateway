package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EOProdLocation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	public float displayOrder;
	@ManyToOne
	@JoinColumn(name="ProductID")
	public EOProduct eoProduct;
	
	@ManyToOne
	@JoinColumn(name="LocationID")
	public EOLocation eoLocation;
	
}