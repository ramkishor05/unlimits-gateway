package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public  class EORecipe implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public float qnt; 

	@ManyToOne
	@JoinColumn(name="PrepID")
	public EOPrep eoPrep;
	
	@ManyToOne
	@JoinColumn(name="ProductID")
	public EOProduct eoProduct;
}
