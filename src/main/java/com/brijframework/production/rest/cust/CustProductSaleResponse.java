package com.brijframework.production.rest.cust;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.brijframework.production.dto.UICustomer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CustProductSaleResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String idenNo;

	private Double discounts;
	
	private Double retailSaleQnt;

	private Double retailSaleTotals;
	
	private Double wholeSaleQnt;

	private Double wholeSaleTotals;
	
	private Long custProductionAppId;
	
	private Date  saleDate;
	
	private UICustomer customer;

	private List<CustProductRetailSaleResponse> custProductRetailSaleList;

	private List<CustProductWholeSaleResponse> custProductWholeSaleList;

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
	
	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public UICustomer getCustomer() {
		return customer;
	}

	public void setCustomer(UICustomer customer) {
		this.customer = customer;
	}

	public Long getCustProductionAppId() {
		return custProductionAppId;
	}

	public void setCustProductionAppId(Long custProductionAppId) {
		this.custProductionAppId = custProductionAppId;
	}

	public Double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Double discounts) {
		this.discounts = discounts;
	}

	public Double getRetailSaleTotals() {
		if(retailSaleTotals==null || retailSaleTotals==0) {
			retailSaleTotals=custProductRetailSaleList.stream().filter(custProductRetail->custProductRetail.getRetailPrice()!=null && custProductRetail.getRetailQnt()!=null).collect(Collectors.summarizingDouble(custProductRetailSale->custProductRetailSale.getRetailPrice()*custProductRetailSale.getRetailQnt())).getSum();
		}
		return retailSaleTotals;
	}

	public void setRetailSaleTotals(Double retailSaleTotals) {
		this.retailSaleTotals = retailSaleTotals;
	}

	public Double getWholeSaletotals() {
		if(wholeSaleTotals==null || wholeSaleTotals==0) {
			wholeSaleTotals= custProductWholeSaleList.stream().filter(custProductRetail->custProductRetail.getWholePrice()!=null && custProductRetail.getWholeQnt()!=null).collect(Collectors.summarizingDouble(custProductWholeSale->custProductWholeSale.getWholePrice()*custProductWholeSale.getWholeQnt())).getSum();
		}
		return wholeSaleTotals;
	}

	public void setWholeSaleTotals(Double wholeSaleTotals) {
		this.wholeSaleTotals = wholeSaleTotals;
	}
	

	public Double getRetailSaleQnt() {
		if(retailSaleQnt==null ||retailSaleQnt==0) {
			retailSaleQnt= custProductRetailSaleList.stream().filter(custProductRetail->custProductRetail.getRetailQnt()!=null).collect(Collectors.summarizingDouble(custProductRetail->custProductRetail.getRetailQnt())).getSum();
		}
		return retailSaleQnt;
	}

	public void setRetailSaleQnt(Double retailSaleQnt) {
		this.retailSaleQnt = retailSaleQnt;
	}

	public Double getWholeSaleQnt() {
		if(wholeSaleQnt==null ||wholeSaleQnt==0) {
			wholeSaleQnt = custProductWholeSaleList.stream().filter(custProductRetail->custProductRetail.getWholeQnt()!=null).collect(Collectors.summarizingDouble(custProductWholeSale->custProductWholeSale.getWholeQnt())).getSum();
		}
		return wholeSaleQnt;
	}

	public void setWholeSaleQnt(Double wholeSaleQnt) {
		this.wholeSaleQnt = wholeSaleQnt;
	}

	public List<CustProductRetailSaleResponse> getCustProductRetailSaleList() {
		return custProductRetailSaleList;
	}

	public void setCustProductRetailSaleList(List<CustProductRetailSaleResponse> custProductRetailSaleList) {
		this.custProductRetailSaleList = custProductRetailSaleList;
	}

	public List<CustProductWholeSaleResponse> getCustProductWholeSaleList() {
		return custProductWholeSaleList;
	}

	public void setCustProductWholeSaleList(List<CustProductWholeSaleResponse> custProductWholeSaleList) {
		this.custProductWholeSaleList = custProductWholeSaleList;
	}
}
