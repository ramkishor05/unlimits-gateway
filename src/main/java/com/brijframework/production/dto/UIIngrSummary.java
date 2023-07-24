package com.brijframework.production.dto;

import java.io.Serializable;
import java.util.List;

import com.brijframework.production.dto.cust.UICustIngredient;
import com.brijframework.production.dto.cust.UICustStorage;
import com.brijframework.production.dto.global.UIGlobalCountFreq;
import com.brijframework.production.dto.global.UIGlobalUnitGroup;

public class UIIngrSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UIGlobalUnitGroup> unitGroupList;
	
	public List<UICustIngredient> ingrList;
	
	public List<UICustCategory> categoryList;
	
	public List<UICustStorage> storageList;
	
	public List<UIGlobalCountFreq> countFreqList;

}