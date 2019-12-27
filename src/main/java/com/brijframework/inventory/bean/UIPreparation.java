package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

public class UIPreparation implements Serializable{

	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public String name;
	public  String logoUrl;
	public String description;
	public double qnt;
	public long eoImgDetail;

	
	public List<UILocation> locationArray;
	
}
