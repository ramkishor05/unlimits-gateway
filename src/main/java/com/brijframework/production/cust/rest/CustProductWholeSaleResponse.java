package com.brijframework.production.cust.rest;

import java.io.Serializable;

import com.brijframework.production.cust.dto.UICustProduct;
import com.brijframework.production.global.dto.UIGlobalUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)

public class CustProductWholeSaleResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String idenNo;
	// for purchase items
	private Double purchasePrice;
	private UIGlobalUnit purchaseUnit;

	// for sale items
	private Double wholeQnt;
	private Double wholePrice;
	private UIGlobalUnit wholeUnit;
	
	private UICustProduct custProduct;

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

	public Double getWholeQnt() {
		return wholeQnt;
	}

	public void setWholeQnt(Double wholeQnt) {
		this.wholeQnt = wholeQnt;
	}

	public Double getWholePrice() {
		return wholePrice;
	}

	public void setWholePrice(Double wholePrice) {
		this.wholePrice = wholePrice;
	}

	public UIGlobalUnit getWholeUnit() {
		return wholeUnit;
	}

	public void setWholeUnit(UIGlobalUnit wholeUnit) {
		this.wholeUnit = wholeUnit;
	}

	public UICustProduct getCustProduct() {
		return custProduct;
	}

	public void setCustProduct(UICustProduct custProduct) {
		this.custProduct = custProduct;
	}

	
}
