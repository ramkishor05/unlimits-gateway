package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EOInvUnit implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String typeID;
	public String shortDesc;
	public String longDesc;
	public String friendlyName;
		
	@ManyToOne
	@JoinColumn(name="EOUnitGroupID")
	public EOInvUnitGroup  eoUnitGroup;
	public long id;
}
