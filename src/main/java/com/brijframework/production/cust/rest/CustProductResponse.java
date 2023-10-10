package com.brijframework.production.cust.rest;

import java.io.Serializable;
import java.util.Date;

import com.brijframework.production.dto.UICustCategory;
import com.brijframework.production.dto.UIManufacturer;
import com.brijframework.production.global.dto.UIGlobalMediaDetail;
import com.brijframework.production.global.dto.UIGlobalUnit;

public class CustProductResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String idenNo;
	private String title;
	private String name;
	private String desc;
	private String logoUrl;
	private Date expDate;
	private Date mfrDate;
	// for purchase items
	private Double purchasePrice;
	private UIGlobalUnit purchaseUnit;
	// for sale items
	private Double retailPrice;
	private UIGlobalUnit retailUnit;
	
	private Double wholePrice;
	
	private UIGlobalUnit wholeUnit;
	
	// for stock items
	private Long stockQnt;
	private Long saleQnt;
	
	private Long custProductionAppId;
	
	private UICustCategory custCategory;
	
	private UIGlobalMediaDetail custMediaDetail;
	
	private UIManufacturer custManufacturer;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Long getCustProductionAppId() {
		return custProductionAppId;
	}

	public void setCustProductionAppId(Long custAppId) {
		this.custProductionAppId = custAppId;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Date getMfrDate() {
		return mfrDate;
	}

	public void setMfrDate(Date mfrDate) {
		this.mfrDate = mfrDate;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getWholePrice() {
		return wholePrice;
	}

	public void setWholePrice(Double wholePrice) {
		this.wholePrice = wholePrice;
	}

	public Long getStockQnt() {
		return stockQnt;
	}

	public void setStockQnt(Long stockQnt) {
		this.stockQnt = stockQnt;
	}

	public Long getSaleQnt() {
		return saleQnt;
	}

	public void setSaleQnt(Long saleQnt) {
		this.saleQnt = saleQnt;
	}
	
	public UIGlobalUnit getPurchaseUnit() {
		return purchaseUnit;
	}

	public void setPurchaseUnit(UIGlobalUnit purchaseUnit) {
		this.purchaseUnit = purchaseUnit;
	}

	public UIGlobalUnit getRetailUnit() {
		return retailUnit;
	}

	public void setRetailUnit(UIGlobalUnit retailUnit) {
		this.retailUnit = retailUnit;
	}

	public UIGlobalUnit getWholeUnit() {
		return wholeUnit;
	}

	public void setWholeUnit(UIGlobalUnit wholeUnit) {
		this.wholeUnit = wholeUnit;
	}

	public UICustCategory getCustCategory() {
		return custCategory;
	}

	public void setCustCategory(UICustCategory custCategory) {
		this.custCategory = custCategory;
	}

	public UIGlobalMediaDetail getCustMediaDetail() {
		return custMediaDetail;
	}

	public void setCustMediaDetail(UIGlobalMediaDetail custMediaDetail) {
		this.custMediaDetail = custMediaDetail;
	}

	public UIManufacturer getCustManufacturer() {
		return custManufacturer;
	}

	public void setCustManufacturer(UIManufacturer custManufacturer) {
		this.custManufacturer = custManufacturer;
	}
	
}
