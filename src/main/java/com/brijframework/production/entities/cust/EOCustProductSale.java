package com.brijframework.production.entities.cust;

import static com.brijframework.production.contants.Constants.*;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.production.contants.Constants.DISCOUNTS;
import static com.brijframework.production.contants.Constants.EOCUST_PRODUCT_SALE;
import static com.brijframework.production.contants.Constants.RETAIL_SALE_TOTALS;
import static com.brijframework.production.contants.Constants.WHOLE_SALE_TOTALS;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.production.entities.EOCustomer;
import com.brijframework.production.entities.global.EOGlobalItem;

@Entity
@Table(name = EOCUST_PRODUCT_SALE)
public class EOCustProductSale extends EOGlobalItem {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = DISCOUNTS)
	private Double discounts;

	@Column(name = RETAIL_SALE_TOTALS)
	private Double retailSaleTotals;

	@Column(name = WHOLE_SALE_TOTALS)
	private Double wholeSaletotals;
	
	@JoinColumn(name = CUSTOMER_ID, nullable = false)
	@ManyToOne
	private EOCustomer customer;
	
	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustProductionApp custProductionApp;

	@OneToMany(mappedBy = CUST_PRODUCT_SALE)
	private List<EOCustProductRetailSale> custProductRetailSaleList;

	@OneToMany(mappedBy = CUST_PRODUCT_SALE)
	private List<EOCustProductWholeSale> custProductWholeSaleList;
	

	public EOCustProductionApp getCustProductionApp() {
		return custProductionApp;
	}

	public void setCustProductionApp(EOCustProductionApp custProductionApp) {
		this.custProductionApp = custProductionApp;
	}

	public Double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Double discounts) {
		this.discounts = discounts;
	}

	public Double getRetailSaleTotals() {
		return retailSaleTotals;
	}

	public void setRetailSaleTotals(Double retailSaleTotals) {
		this.retailSaleTotals = retailSaleTotals;
	}

	public Double getWholeSaletotals() {
		return wholeSaletotals;
	}

	public void setWholeSaletotals(Double wholeSaletotals) {
		this.wholeSaletotals = wholeSaletotals;
	}

	public List<EOCustProductRetailSale> getCustProductRetailSaleList() {
		return custProductRetailSaleList;
	}

	public void setCustProductRetailSaleList(List<EOCustProductRetailSale> custProductRetailSaleList) {
		this.custProductRetailSaleList = custProductRetailSaleList;
	}

	public List<EOCustProductWholeSale> getCustProductWholeSaleList() {
		return custProductWholeSaleList;
	}

	public void setCustProductWholeSaleList(List<EOCustProductWholeSale> custProductWholeSaleList) {
		this.custProductWholeSaleList = custProductWholeSaleList;
	}

}
