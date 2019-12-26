package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

import com.brijframework.inventory.model.EOCountFreq;
import com.brijframework.inventory.model.EOInvApp;
import com.brijframework.inventory.model.EOPrep;
import com.brijframework.inventory.model.EOStorage;

public class UIPrepSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UIPreparation> prepList;
	
	public List<UIStorage> storageList;
	
	public List<UICountFreq> countFreqList;

	private EOInvApp eoInvApp;
	public UIPrepSummary(EOInvApp eoInvApp) {
		this.eoInvApp=eoInvApp;
		this.fillData();
	}
	
	private void fillData() {
		for(EOPrep eoPrep:eoInvApp.eoPrepArray){
			prepList.add(new UIPreparation(eoPrep));
		}
		for (EOStorage eoStorage : eoInvApp.eoStorageArray) {
			UIStorage storage=new UIStorage(eoStorage);
			storage.loadLocations();
			storageList.add(storage);
		}
		for (EOCountFreq eoCountFreq : eoInvApp.eoCountFreqArray) {
			countFreqList.add(new UICountFreq(eoCountFreq));
		}
	}

}
