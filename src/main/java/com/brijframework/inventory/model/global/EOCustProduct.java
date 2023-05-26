package com.brijframework.inventory.model.global;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.brijframework.inventory.model.EOInventoryApp;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="EOCUST_PRODUCT", uniqueConstraints = { @UniqueConstraint(columnNames = { "IDEN_NO" }) })
public class EOCustProduct extends EOGlobalItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;

	@Column(name="TITLE")
	private String title;
	
	//for purchase cost
	@Column(name="UNIT_PRICE")
	private Double unitPrice;
	
	@Column(name="PURCHASE_PRICE")
	private Double purchasePrice;
	
	//for sale cost
	@Column(name="RETAIL_PRICE")
	private Double retailPrice;
	
	@Column(name="WHOLE_PRICE")
	private Double wholePrice;
	
	@Column(name="STOCK_QTN")
	private Long stockQnt;
	
	@Column(name="SALE_QTN")
	private Long saleQnt;
	
	@Column(name="EXPIRY_DATE")
	private Date expDate;

	@Column(name="MRFTR_DATE")
	private Date mfrDate;

	@OneToOne
	@JoinColumn(name = "LOGO_ID")
	public EOGlobalMediaDetail imgDetail;

	@OneToOne
	@JoinColumn(name = "MANUFACTURER_ID")
	public EOGlobalManufacturer manufacturer;

	@ManyToOne
	@JoinColumn(name = "INV_APP_ID")
	public EOInventoryApp inventoryApp;

	@OneToOne
	@JoinColumn(name = "CATEGORY_ID")
	public EOGlobalCategory category;

	@OneToMany(mappedBy = "product")
	public List<EOGlobalProductRecipe> productRecipes;

	@OneToMany(mappedBy = "product")
	public List<EOGlobalProductDetail> productDetails;

	@OneToMany(mappedBy = "product")
	public List<EOGlobalProductVariant> productVariants;

	@OneToMany(mappedBy = "product")
	public List<EOGlobalProductLocation> productLocations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
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

	public EOGlobalMediaDetail getImgDetail() {
		return imgDetail;
	}

	public void setImgDetail(EOGlobalMediaDetail imgDetail) {
		this.imgDetail = imgDetail;
	}

	public EOGlobalManufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(EOGlobalManufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public EOInventoryApp getInventoryApp() {
		return inventoryApp;
	}

	public void setInventoryApp(EOInventoryApp inventoryApp) {
		this.inventoryApp = inventoryApp;
	}

	public EOGlobalCategory getCategory() {
		return category;
	}

	public void setCategory(EOGlobalCategory category) {
		this.category = category;
	}

	public List<EOGlobalProductRecipe> getProductRecipes() {
		return productRecipes;
	}

	public void setProductRecipes(List<EOGlobalProductRecipe> productRecipes) {
		this.productRecipes = productRecipes;
	}

	public List<EOGlobalProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<EOGlobalProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

	public List<EOGlobalProductVariant> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(List<EOGlobalProductVariant> productVariants) {
		this.productVariants = productVariants;
	}

	public List<EOGlobalProductLocation> getProductLocations() {
		return productLocations;
	}

	public void setProductLocations(List<EOGlobalProductLocation> productLocations) {
		this.productLocations = productLocations;
	}
}
