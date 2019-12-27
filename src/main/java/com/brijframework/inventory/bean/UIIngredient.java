package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

public class UIIngredient implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public String name;
	public  String logoUrl;
	public String description;
	
	public long eoCategory;	
	public long eoBaseUnit;
	public long eoRptUnit;
	public long eoImgDetail;
	
	public List<UILocation> locationArray;
	
	public List<UICountFreq> countFreqArray;
	
	
	
}

