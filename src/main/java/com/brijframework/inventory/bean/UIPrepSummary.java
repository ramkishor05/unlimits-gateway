package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

public class UIPrepSummary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UIPreparation> prepList;
	
	public List<UIStorage> storageList;
	
	public List<UICountFreq> countFreqList;

}
