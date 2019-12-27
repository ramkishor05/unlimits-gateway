package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

public class UIStorage implements Serializable{

	private static final long serialVersionUID = 1L;
	public long id;
	public float displayOrder;
	public String name;
	public boolean active;

	public List<UILocation> locationList;

}
