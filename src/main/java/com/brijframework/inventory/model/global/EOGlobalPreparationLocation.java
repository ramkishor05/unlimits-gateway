package com.brijframework.inventory.model.global;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EOGlobalPreparationLocation implements Serializable{

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
	public EOGlobalPreparation preparation;
	
	@ManyToOne
	@JoinColumn(name="LocationID")
	public EOGlobalLocation location;

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

	public EOGlobalPreparation getPreparation() {
		return preparation;
	}

	public void setPreparation(EOGlobalPreparation prep) {
		this.preparation = prep;
	}

	public EOGlobalLocation getLocation() {
		return location;
	}

	public void setLocation(EOGlobalLocation location) {
		this.location = location;
	}

	
}

