package com.brijframework.production.dto;

import java.io.Serializable;
import java.util.List;

import com.brijframework.production.dto.cust.UICustIngredient;
import com.brijframework.production.dto.cust.UICustStorage;

public class UIIngrSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UIGlobalUnitGroup> unitGroupList;
	
	public List<UICustIngredient> ingrList;
	
	public List<UICategory> categoryList;
	
	public List<UICustStorage> storageList;
	
	public List<UIGlobalCountFreq> countFreqList;

}