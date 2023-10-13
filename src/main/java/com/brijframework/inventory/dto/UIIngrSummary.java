package com.brijframework.inventory.dto;

import java.io.Serializable;
import java.util.List;

public class UIIngrSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UICustIngredient> ingrList;
	
	public List<UICustStorage> storageList;
	
	public List<UIGlobalCountFreq> countFreqList;

}