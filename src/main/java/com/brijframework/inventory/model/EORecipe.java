package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public  class EORecipe implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public float qnt; 

	@ManyToOne
	@JoinColumn(name="PrepID")
	public EOPrep eoPrep;
	
	@ManyToOne
	@JoinColumn(name="ProductID")
	public EOProduct eoProduct;
}
