package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

import com.brijframework.inventory.model.EOLocation;
import com.brijframework.inventory.model.EOStorage;

public class UIStorage implements Serializable{

	private static final long serialVersionUID = 1L;
	public long id;
	public float displayOrder;
	public String name;
	public boolean isActive;

	private EOStorage eoStorage;
	
	public List<UILocation> locationList;

	public UIStorage(EOStorage eoStorage) {
		this.eoStorage=eoStorage;
		this.fillData();
	}

	private void fillData() {
		this.id=eoStorage.id;
		this.displayOrder=eoStorage.displayOrder;
		this.name=eoStorage.name;
		this.isActive=eoStorage.active;
	}
	
	public void loadLocations(){
		for(EOLocation eoLocation:this.eoStorage.eoLocationArray){
			locationList.add(new UILocation(eoLocation));
		}
	}
}
