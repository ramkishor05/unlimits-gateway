package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

public class UIProductSummary implements Serializable{

	private static final long serialVersionUID = 1L;

	public List<UIProduct> productList;
	
	public List<UILocation> locationList;
	
	public List<UICountFreq> countFreqList;
	
}
