package com.brijframework.production.entities.cust;

import static com.brijframework.production.contants.Constants.CUST_PRODUCT_ID;
import static com.brijframework.production.contants.Constants.CUST_PRODUCT_SALE_ID;
import static com.brijframework.production.contants.Constants.EOCUST_PRODUCT_WHOLE_SALE;
import static com.brijframework.production.contants.Constants.PURCHASE_PRICE;
import static com.brijframework.production.contants.Constants.PURCHASE_UNIT;
import static com.brijframework.production.contants.Constants.WHOLE_PRICE;
import static com.brijframework.production.contants.Constants.WHOLE_QTN;
import static com.brijframework.production.contants.Constants.WHOLE_UNIT;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PRODUCT_WHOLE_SALE)
public class EOCustProductWholeSale extends EOCustItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// for purchase cost
	@Column(name = PURCHASE_PRICE)
	private Double purchasePrice;

	@JoinColumn(name = PURCHASE_UNIT)
	@OneToOne
	private EOCustUnit purchaseUnit;

	@Column(name = WHOLE_PRICE)
	private Double wholePrice;

	@JoinColumn(name = WHOLE_UNIT)
	@OneToOne
	private EOCustUnit wholeUnit;

	@Column(name = WHOLE_QTN)
	private Long wholeQnt;

	@Column(name = "DISCOUNT")
	private Double discount;

	@JoinColumn(name = CUST_PRODUCT_ID)
	@ManyToOne
	private EOCustProduct custProduct;

	@JoinColumn(name = CUST_PRODUCT_SALE_ID)
	@ManyToOne
	private EOCustProductSale custProductSale;

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public EOCustUnit getPurchaseUnit() {
		return purchaseUnit;
	}

	public void setPurchaseUnit(EOCustUnit purchaseUnit) {
		this.purchaseUnit = purchaseUnit;
	}

	public Double getWholePrice() {
		return wholePrice;
	}

	public void setWholePrice(Double wholePrice) {
		this.wholePrice = wholePrice;
	}

	public EOCustUnit getWholeUnit() {
		return wholeUnit;
	}

	public void setWholeUnit(EOCustUnit wholeUnit) {
		this.wholeUnit = wholeUnit;
	}

	public Long getWholeQnt() {
		return wholeQnt;
	}

	public void setWholeQnt(Long wholeQnt) {
		this.wholeQnt = wholeQnt;
	}

	public EOCustProduct getCustProduct() {
		return custProduct;
	}

	public void setCustProduct(EOCustProduct custProduct) {
		this.custProduct = custProduct;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public EOCustProductSale getCustProductSale() {
		return custProductSale;
	}

	public void setCustProductSale(EOCustProductSale custProductSale) {
		this.custProductSale = custProductSale;
	}

}
