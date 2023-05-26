package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UIProduct implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String idenNo;
	private String title;
	private String name;
	private String description;
	private String logoUrl;

	private Long imgDetailId;
	
	private Long inventoryAppId;
	private Long categoryId;
	
	private Date expDate;
	private Date mfrDate;
	
	// for purchase items
	private Double unitPrice;
	private Double purchasePrice;
	
	// for sale items
	private Double retailPrice;
	private Double wholePrice;
	
	private Long stockQnt;
	
	private Long saleQnt;

	public UIManufacturer manufacturer;

	public List<UIProductRecipe> productRecipes;

	public List<UIProductDetail> productDetails;

	public List<UIProductVariant> productVariants;

	public List<UIProdLocation> productLocations;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Long getImgDetailId() {
		return imgDetailId;
	}

	public void setImgDetailId(Long imgDetailId) {
		this.imgDetailId = imgDetailId;
	}

	public Long getInventoryAppId() {
		return inventoryAppId;
	}

	public void setInventoryAppId(Long inventoryAppId) {
		this.inventoryAppId = inventoryAppId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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

	public UIManufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(UIManufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<UIProductRecipe> getProductRecipes() {
		return productRecipes;
	}

	public void setProductRecipes(List<UIProductRecipe> productRecipes) {
		this.productRecipes = productRecipes;
	}

	public List<UIProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<UIProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

	public List<UIProductVariant> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(List<UIProductVariant> productVariants) {
		this.productVariants = productVariants;
	}

	public List<UIProdLocation> getProductLocations() {
		return productLocations;
	}

	public void setProductLocations(List<UIProdLocation> productLocations) {
		this.productLocations = productLocations;
	}

}
