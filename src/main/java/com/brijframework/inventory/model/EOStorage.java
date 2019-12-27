package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EOStorage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public float displayOrder;
	public String name;
	public boolean active;
	
	@ManyToOne
	@JoinColumn(name="InvAppID",nullable=false)
    public EOInvApp eoInvApp;
	
	@OneToMany(mappedBy="eoStorage")
	public Set<EOLocation> eoLocationArray=new LinkedHashSet<>();
	
}
