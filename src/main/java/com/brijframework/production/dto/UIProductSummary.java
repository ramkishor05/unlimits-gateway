package com.brijframework.production.dto;

import java.io.Serializable;
import java.util.List;

import com.brijframework.production.dto.cust.UICustLocation;
import com.brijframework.production.dto.cust.UICustProduct;
import com.brijframework.production.dto.global.UIGlobalCountFreq;

public class UIProductSummary implements Serializable{

	private static final long serialVersionUID = 1L;

	public List<UICustProduct> productList;
	
	public List<UICustLocation> locationList;
	
	public List<UIGlobalCountFreq> countFreqList;
	
}
