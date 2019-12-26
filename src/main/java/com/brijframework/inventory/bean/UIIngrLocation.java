package com.brijframework.inventory.bean;

import com.brijframework.inventory.model.EOIngrLocation;
import com.brijframework.inventory.model.EOLocation;

public class UIIngrLocation extends UILocation {

	private static final long serialVersionUID = 1L;

	public long eoIngr;
	public long eoLocation;
	
	public UIIngrLocation(EOLocation eoLocation) {
		super(eoLocation);
	}

	public void setIngr(EOIngrLocation eoIngrLocation) {
        this.id=eoIngrLocation.id;
        this.eoIngr=eoIngrLocation.eoIngr.id;
        this.eoLocation=eoIngrLocation.eoLocation.id;
	}
}
