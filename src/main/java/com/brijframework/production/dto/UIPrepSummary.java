package com.brijframework.production.dto;

import java.io.Serializable;
import java.util.List;

import com.brijframework.production.cust.dto.UICustPreparation;
import com.brijframework.production.cust.dto.UICustStorage;
import com.brijframework.production.global.dto.UIGlobalCountFreq;

public class UIPrepSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UICustPreparation> prepList;
	
	public List<UICustStorage> storageList;
	
	public List<UIGlobalCountFreq> countFreqList;

}
