package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

import com.brijframework.inventory.model.EOCountFreq;
import com.brijframework.inventory.model.EOInvApp;
import com.brijframework.inventory.model.EOLocation;
import com.brijframework.inventory.model.EOProduct;

public class UIProductSummary implements Serializable{

	private static final long serialVersionUID = 1L;

	public List<UIProduct> productList;
	
	public List<UILocation> locationList;
	
	public List<UICountFreq> countFreqList;
	
	private EOInvApp eoInvApp;
	
	public UIProductSummary(EOInvApp eoInvApp) {
		this.eoInvApp=eoInvApp;
		this.fillData();
		
	}
	private void fillData() {
		for(EOProduct eoProduct:eoInvApp.eoProductArray){
			productList.add(new UIProduct(eoProduct));
		}
		for (EOLocation eoLocation : eoInvApp.eoLocationArray) {
			locationList.add(new UILocation(eoLocation));
		}
		for (EOCountFreq eoCountFreq : eoInvApp.eoCountFreqArray) {
			countFreqList.add(new UICountFreq(eoCountFreq));
		}
	}
}
