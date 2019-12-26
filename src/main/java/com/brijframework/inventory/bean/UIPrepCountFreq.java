package com.brijframework.inventory.bean;

import com.brijframework.inventory.model.EOCountFreq;
import com.brijframework.inventory.model.EOPrepCountFreq;

public class UIPrepCountFreq extends UICountFreq{
	private static final long serialVersionUID = 1L;

	public long eoPrep;
	public long eoCountFreq;
	

	public UIPrepCountFreq(EOCountFreq eoCountFreq) {
		super(eoCountFreq);
	}
	
	public void setIngr(EOPrepCountFreq countFreq) {
		this.id=countFreq.id;
		this.eoPrep=countFreq.eoPrep.id;
		this.eoCountFreq=countFreq.id;
	}
}