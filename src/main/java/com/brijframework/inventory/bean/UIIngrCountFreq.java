package com.brijframework.inventory.bean;

import com.brijframework.inventory.model.EOCountFreq;
import com.brijframework.inventory.model.EOIngrCountFreq;

public class UIIngrCountFreq extends UICountFreq{
	private static final long serialVersionUID = 1L;

	public long eoIngr;
	public long eoCountFreq;

	public UIIngrCountFreq(EOCountFreq eoCountFreq) {
		super(eoCountFreq);
	}
	
	public void setIngr(EOIngrCountFreq countFreq) {
		this.id=countFreq.id;
		this.eoIngr=countFreq.eoIngr.id;
		this.eoCountFreq=countFreq.eoCountFreq.id;
	}
}


