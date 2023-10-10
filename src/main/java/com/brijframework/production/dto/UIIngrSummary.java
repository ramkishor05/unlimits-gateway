package com.brijframework.production.dto;

import java.io.Serializable;
import java.util.List;

import com.brijframework.production.cust.dto.UICustIngredient;
import com.brijframework.production.cust.dto.UICustStorage;
import com.brijframework.production.global.dto.UIGlobalCountFreq;
import com.brijframework.production.global.dto.UIGlobalUnitGroup;

public class UIIngrSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UIGlobalUnitGroup> unitGroupList;
	
	public List<UICustIngredient> ingrList;
	
	public List<UICustCategory> categoryList;
	
	public List<UICustStorage> storageList;
	
	public List<UIGlobalCountFreq> countFreqList;

}