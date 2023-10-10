package com.brijframework.production.cust.rest;

import java.io.Serializable;

public class CustProductRetailSaleRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String idenNo;
	// for purchase items
	private Double purchasePrice;
	private Long purchaseUnitId;

	private Long custProductId;
	// for sale items
	private Double retailQnt;
	private Double retailPrice;
	private Long retailUnitId;

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
	
	

	public Long getCustProductId() {
		return custProductId;
	}

	public void setCustProductId(Long custProductId) {
		this.custProductId = custProductId;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Long getPurchaseUnitId() {
		return purchaseUnitId;
	}

	public void setPurchaseUnitId(Long purchaseUnitId) {
		this.purchaseUnitId = purchaseUnitId;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Long getRetailUnitId() {
		return retailUnitId;
	}

	public void setRetailUnitId(Long retailUnitId) {
		this.retailUnitId = retailUnitId;
	}

	public Double getRetailQnt() {
		return retailQnt;
	}

	public void setRetailQnt(Double retailQnt) {
		this.retailQnt = retailQnt;
	}
}
