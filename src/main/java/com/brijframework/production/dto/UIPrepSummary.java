package com.brijframework.production.dto;

import java.io.Serializable;
import java.util.List;

import com.brijframework.production.dto.cust.UICustPreparation;
import com.brijframework.production.dto.cust.UICustStorage;

public class UIPrepSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UICustPreparation> prepList;
	
	public List<UICustStorage> storageList;
	
	public List<UIGlobalCountFreq> countFreqList;

}
