package com.brijframework.production.dto;

import java.io.Serializable;
import java.util.List;

import com.brijframework.production.cust.dto.UICustLocation;
import com.brijframework.production.cust.dto.UICustProduct;
import com.brijframework.production.global.dto.UIGlobalCountFreq;

public class UIProductSummary implements Serializable{

	private static final long serialVersionUID = 1L;

	public List<UICustProduct> productList;
	
	public List<UICustLocation> locationList;
	
	public List<UIGlobalCountFreq> countFreqList;
	
}
