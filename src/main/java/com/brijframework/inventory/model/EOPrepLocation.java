package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EOPrepLocation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
    
	public float displayOrder;
	@ManyToOne
	@JoinColumn(name="PrepID")
	public EOPrep prep;
	
	@ManyToOne
	@JoinColumn(name="LocationID")
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

	public EOPrep getPrep() {
		return prep;
	}

	public void setPrep(EOPrep prep) {
		this.prep = prep;
	}

	public EOLocation getLocation() {
		return location;
	}

	public void setLocation(EOLocation location) {
		this.location = location;
	}

	
}

