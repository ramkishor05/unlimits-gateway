package com.brijframework.inventory.bean;

import java.io.Serializable;

import com.brijframework.inventory.model.EOLocation;

public class UILocation implements Serializable{

	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public float displayOrder;
	public String name;
	public boolean isActive;
	public long eoStorage;
	
	private EOLocation eoLocation;
	
	public UILocation(EOLocation eoLocation) {
		this.eoLocation=eoLocation;
		this.fillData();
	}
	private void fillData() {
		this.id=eoLocation.id;
		this.idenNo=eoLocation.idenNo;
		this.displayOrder=eoLocation.displayOrder;
		this.name=eoLocation.name;
		this.isActive=eoLocation.active;
		this.eoStorage=this.eoLocation.eoStorage.id;
	}
}