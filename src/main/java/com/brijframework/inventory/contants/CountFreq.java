package com.brijframework.inventory.contants;

import com.brijframework.inventory.bean.UICountFreq;

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
	
	public UICountFreq getCountFreq() {
		UICountFreq countFreq=new UICountFreq(); 
		countFreq.setDescription(this.getDesc());
		countFreq.setTypeId(this.getTypeId());
		countFreq.setName(this.getName());
		countFreq.setActive(true);
		return countFreq;
	}
}
