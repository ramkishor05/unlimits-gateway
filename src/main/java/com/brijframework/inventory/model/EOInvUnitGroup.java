package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EOInvUnitGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String typeID;
	public String shortDesc;
	public String longDesc;
	public String friendlyName;
	
	@ManyToOne
	@JoinColumn(name="InvAppID")
    public EOInvApp eoInvApp;
	
	
	@OneToMany(mappedBy="eoUnitGroup")
	public Set<EOInvUnit> eoUnitArray=new LinkedHashSet<>();
}