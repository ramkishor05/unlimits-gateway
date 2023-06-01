package com.brijframework.production.dto.cust;

import java.io.Serializable;
import java.util.List;

import com.brijframework.production.dto.UIIngrCountFreq;
import com.brijframework.production.dto.UIIngrLocation;

public class UICustIngredient implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String idenNo;
	private String name;
	private String logoUrl;
	private String description;

	private long custCategoryId;
	private long custBaseUnitId;
	private long custReptUnitId;
	private long glbImgDetailId;
	private long custProductionAppId;

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

	public long getCustCategoryId() {
		return custCategoryId;
	}

	public void setCustCategoryId(long custCategoryId) {
		this.custCategoryId = custCategoryId;
	}

	public long getCustBaseUnitId() {
		return custBaseUnitId;
	}

	public void setCustBaseUnitId(long custBaseUnitId) {
		this.custBaseUnitId = custBaseUnitId;
	}

	public long getCustReptUnitId() {
		return custReptUnitId;
	}

	public void setCustReptUnitId(long custReptUnitId) {
		this.custReptUnitId = custReptUnitId;
	}

	public long getGlbImgDetailId() {
		return glbImgDetailId;
	}

	public void setGlbImgDetailId(long glbImgDetailId) {
		this.glbImgDetailId = glbImgDetailId;
	}

	public long getCustProductionAppId() {
		return custProductionAppId;
	}

	public void setCustProductionAppId(long custProductionAppId) {
		this.custProductionAppId = custProductionAppId;
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
