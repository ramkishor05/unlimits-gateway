package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class EOImgDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public long id;
	public String type;
	public String url;
	public byte[] detail;

	
	
}
