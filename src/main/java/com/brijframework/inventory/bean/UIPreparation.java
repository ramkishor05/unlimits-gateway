package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class UIPreparation implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String idenNo;
	private String name;
	private String logoUrl;
	private String description;
	private double qnt;
	private long imgDetailId;

	private Long inventoryAppId;

	public List<UIPrepLocation> locations;
	
	public List<UIPrepCountFreq> countFreqs;
	
	public Set<UIPrepRecipe> recipes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQnt() {
		return qnt;
	}

	public void setQnt(double qnt) {
		this.qnt = qnt;
	}

	public long getImgDetailId() {
		return imgDetailId;
	}

	public void setImgDetailId(long imgDetailId) {
		this.imgDetailId = imgDetailId;
	}

	public Long getInventoryAppId() {
		return inventoryAppId;
	}

	public void setInventoryAppId(Long inventoryAppId) {
		this.inventoryAppId = inventoryAppId;
	}

	public List<UIPrepLocation> getLocations() {
		return locations;
	}

	public void setLocations(List<UIPrepLocation> locations) {
		this.locations = locations;
	}

}
