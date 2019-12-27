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
public class EOLocation implements Serializable{
   
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	public String idenNo;
	public float displayOrder;
	public String name;
	public boolean active;
	
	@ManyToOne
	@JoinColumn(name="InvAppID",nullable=false)
    public EOInvApp eoInvApp;
	
	@ManyToOne
	@JoinColumn(name="StorageID",nullable=false)
	public EOStorage eoStorage;
	
	@OneToMany(mappedBy="eoLocation")
	public Set<EOIngrLocation> eoIngrLocations=new LinkedHashSet<>();
	
	@OneToMany(mappedBy="eoLocation")
	public Set<EOPrepLocation> eoPrepLocations=new LinkedHashSet<>();
	
	@OneToMany(mappedBy="eoLocation")
	public Set<EOProdLocation> eoProdLocations=new LinkedHashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public float getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(float displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public EOInvApp getEoInvApp() {
		return eoInvApp;
	}

	public void setEoInvApp(EOInvApp eoInvApp) {
		this.eoInvApp = eoInvApp;
	}

	public EOStorage getEoStorage() {
		return eoStorage;
	}

	public void setEoStorage(EOStorage eoStorage) {
		this.eoStorage = eoStorage;
	}

	public Set<EOIngrLocation> getEoIngrLocations() {
		return eoIngrLocations;
	}

	public void setEoIngrLocations(Set<EOIngrLocation> eoIngrLocations) {
		this.eoIngrLocations = eoIngrLocations;
	}

	public Set<EOPrepLocation> getEoPrepLocations() {
		return eoPrepLocations;
	}

	public void setEoPrepLocations(Set<EOPrepLocation> eoPrepLocations) {
		this.eoPrepLocations = eoPrepLocations;
	}

	public Set<EOProdLocation> getEoProdLocations() {
		return eoProdLocations;
	}

	public void setEoProdLocations(Set<EOProdLocation> eoProdLocations) {
		this.eoProdLocations = eoProdLocations;
	}
	

	

    
}
