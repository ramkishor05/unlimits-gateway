package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EOCountFreq implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="InvAppID", nullable=false)
	public EOInvApp eoInvApp;
	
	public String typeID;
	public String name;
	public String description;
	public float displayOrder;

	public boolean active;

	public long id;
	
}
