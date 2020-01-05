package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

public class UIIngredient implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String idenNo;
	private String name;
	private String logoUrl;
	private String description;

	private long categoryId;
	private long baseUnitId;
	private long rptUnitId;
	private long imgDetailId;
	private long inventoryAppId;

	private List<UIIngrLocation> locations;

	private List<UIIngrCountFreq> countFreqs;

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

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public long getBaseUnitId() {
		return baseUnitId;
	}

	public void setBaseUnitId(long baseUnitId) {
		this.baseUnitId = baseUnitId;
	}

	public long getRptUnitId() {
		return rptUnitId;
	}

	public void setRptUnitId(long rptUnitId) {
		this.rptUnitId = rptUnitId;
	}

	public long getImgDetailId() {
		return imgDetailId;
	}

	public void setImgDetailId(long imgDetailId) {
		this.imgDetailId = imgDetailId;
	}

	public long getInventoryAppId() {
		return inventoryAppId;
	}

	public void setInventoryAppId(long inventoryAppId) {
		this.inventoryAppId = inventoryAppId;
	}

	public List<UIIngrLocation> getLocations() {
		return locations;
	}

	public void setLocations(List<UIIngrLocation> locations) {
		this.locations = locations;
	}

	public List<UIIngrCountFreq> getCountFreqs() {
		return countFreqs;
	}

	public void setCountFreqs(List<UIIngrCountFreq> countFreqs) {
		this.countFreqs = countFreqs;
	}

}
