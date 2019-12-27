package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

public class UIIngrSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UIUnitGroup> unitGroupList;
	
	public List<UIIngredient> ingrList;
	
	public List<UICategory> categoryList;
	
	public List<UIStorage> storageList;
	
	public List<UICountFreq> countFreqList;

}