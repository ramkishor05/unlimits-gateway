package com.brijframework.inventory.dto;

import java.io.Serializable;
import java.util.List;

public class UIPrepSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UICustPreparation> prepList;
	
	public List<UICustStorage> storageList;
	
	public List<UIGlobalCountFreq> countFreqList;

}
