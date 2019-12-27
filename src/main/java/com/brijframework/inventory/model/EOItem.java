package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EOItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public String idenNo;
	public String name;
	private String logoUrl;
	public String description;
	
	public void setLogoUrl(String logoUrl){
		this.logoUrl=logoUrl;
	}
	public String getLogoUrl() {
		return this.logoUrl;
	}
	
	@Lob
	public String instructions;
	public float unitCost; // in cents - can be 1.25 cents as this is average

	public String getIdenNo() {
		return idenNo;
	}
	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public float getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
	}
	
	
	
	
}
