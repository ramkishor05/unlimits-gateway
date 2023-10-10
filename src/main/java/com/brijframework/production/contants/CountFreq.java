package com.brijframework.production.contants;

import com.brijframework.production.global.dto.UIGlobalCountFreq;

public enum CountFreq {

	DAILY("DAILY","Daily" ,"Daily",1), WEEKLY("WEEKLY","Weekly" ,"Weekly",7), MONTHLY("MONTHLY","Monthly" ,"Monthly",30), PERIODICALLY("PERIODICALLY","Period" ,"Period",15);
	
	private String typeId;
	private String name;
	private String desc;
	private int days;

	private CountFreq(String typeId, String name, String desc,int days) {
		this.typeId=typeId;
		this.name=name;
		this.desc=desc;
		this.days=days;
	}

	public String getTypeId() {
		return typeId;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public int getDays() {
		return days;
	}
	
	public UIGlobalCountFreq getCountFreq() {
		UIGlobalCountFreq countFreq=new UIGlobalCountFreq(); 
		countFreq.setDesc(this.getDesc());
		countFreq.setTypeId(this.getTypeId());
		countFreq.setName(this.getName());
		countFreq.setActive(true);
		return countFreq;
	}
}
