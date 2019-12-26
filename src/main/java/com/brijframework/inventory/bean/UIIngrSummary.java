package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

import com.brijframework.inventory.model.EOCategory;
import com.brijframework.inventory.model.EOCountFreq;
import com.brijframework.inventory.model.EOIngr;
import com.brijframework.inventory.model.EOInvApp;
import com.brijframework.inventory.model.EOInvUnitGroup;
import com.brijframework.inventory.model.EOStorage;

public class UIIngrSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UIUnitGroup> unitGroupList;
	
	public List<UIIngredient> ingrList;
	
	public List<UICategory> categoryList;
	
	public List<UIStorage> storageList;
	
	public List<UICountFreq> countFreqList;

	private EOInvApp eoInvApp;
	public UIIngrSummary(EOInvApp eoInvApp) {
		this.eoInvApp=eoInvApp;
		this.fillData();
	}
	
	private void fillData() {
		for(EOInvUnitGroup eoInvUnitGroup:eoInvApp.eoUnitGroupArray){
			unitGroupList.add(new UIUnitGroup(eoInvUnitGroup));
		}
		for(EOIngr eoIngr:eoInvApp.eoIngrArray){
			UIIngredient ingredient=new UIIngredient(eoIngr);
			ingredient.fillDetail();
			ingrList.add(ingredient);
		}
		for(EOCategory eoCategory:eoInvApp.eoCategoryArray){
			categoryList.add(new UICategory(eoCategory));
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