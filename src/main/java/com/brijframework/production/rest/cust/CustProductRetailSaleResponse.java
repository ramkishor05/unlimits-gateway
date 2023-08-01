package com.brijframework.production.rest.cust;

import java.io.Serializable;

import com.brijframework.production.dto.global.UIGlobalUnit;

public class CustProductRetailSaleResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String idenNo;
	// for purchase items
	private Double purchasePrice;
	private UIGlobalUnit purchaseUnit;

	// for sale items
	private Double retailQnt;
	private Double retailPrice;
	private UIGlobalUnit retailUnit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public UIGlobalUnit getPurchaseUnit() {
		return purchaseUnit;
	}

	public void setPurchaseUnit(UIGlobalUnit purchaseUnit) {
		this.purchaseUnit = purchaseUnit;
	}

	public Double getRetailQnt() {
		return retailQnt;
	}

	public void setRetailQnt(Double retailQnt) {
		this.retailQnt = retailQnt;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public UIGlobalUnit getRetailUnit() {
		return retailUnit;
	}

	public void setRetailUnit(UIGlobalUnit retailUnit) {
		this.retailUnit = retailUnit;
	}

}
