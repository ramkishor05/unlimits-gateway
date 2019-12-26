package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
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
    
	public float displayOrder;
	@ManyToOne
	@JoinColumn(name="IngrID")
	public EOIngr eoIngr;
	
	@ManyToOne
	@JoinColumn(name="LocationID")
	public EOLocation eoLocation;

	public long id;
	
}

