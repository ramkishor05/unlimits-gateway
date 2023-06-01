package com.brijframework.production.dto.cust;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.brijframework.production.dto.UIPrepCountFreq;
import com.brijframework.production.dto.UIPrepLocation;
import com.brijframework.production.dto.UIPrepRecipe;

public class UICustPreparation implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String idenNo;
	private String name;
	private String logoUrl;
	private String description;
	private double qnt;
	private long glbImgDetailId;

	private Long custProductionAppId;

	public List<UIPrepLocation> custPreparationLocations;

	public List<UIPrepCountFreq> custPreparationLCountFreqs;

	public Set<UIPrepRecipe> custPreparationLRecipes;

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

	public long getGlbImgDetailId() {
		return glbImgDetailId;
	}

	public void setGlbImgDetailId(long glbImgDetailId) {
		this.glbImgDetailId = glbImgDetailId;
	}

	public Long getCustProductionAppId() {
		return custProductionAppId;
	}

	public void setCustProductionAppId(Long custProductionAppId) {
		this.custProductionAppId = custProductionAppId;
	}

	public List<UIPrepLocation> getCustPreparationLocations() {
		return custPreparationLocations;
	}

	public void setCustPreparationLocations(List<UIPrepLocation> custPreparationLocations) {
		this.custPreparationLocations = custPreparationLocations;
	}

	public List<UIPrepCountFreq> getCustPreparationLCountFreqs() {
		return custPreparationLCountFreqs;
	}

	public void setCustPreparationLCountFreqs(List<UIPrepCountFreq> custPreparationLCountFreqs) {
		this.custPreparationLCountFreqs = custPreparationLCountFreqs;
	}

	public Set<UIPrepRecipe> getCustPreparationLRecipes() {
		return custPreparationLRecipes;
	}

	public void setCustPreparationLRecipes(Set<UIPrepRecipe> custPreparationLRecipes) {
		this.custPreparationLRecipes = custPreparationLRecipes;
	}

}
