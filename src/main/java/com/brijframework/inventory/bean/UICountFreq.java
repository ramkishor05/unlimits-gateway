package com.brijframework.inventory.bean;

import java.io.Serializable;

import com.brijframework.inventory.model.EOCountFreq;

public class UICountFreq implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public long id;
	public String typeID;
	public String name;
	public String description;
	public boolean isActive;
	public float displayOrder;
	
	private EOCountFreq countFreq;
	public UICountFreq(EOCountFreq eoCountFreq) {
		this.countFreq=eoCountFreq;
		this.fillData();
	}

	private void fillData() {
		this.id=this.countFreq.id;
		this.name=this.countFreq.name;
		this.description=this.countFreq.description;
		this.typeID=this.countFreq.typeID;
		this.isActive=this.countFreq.active;
		this.displayOrder=this.countFreq.displayOrder;
	}

	
}
