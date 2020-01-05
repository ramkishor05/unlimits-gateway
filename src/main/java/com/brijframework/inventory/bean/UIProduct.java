package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UIProduct implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String idenNo;
	private String name;
	private String logoUrl;
	private String description;
	private long imgDetailId;
	private long inventoryAppId;
	public long categoryId;

	public double price;
	private Date expDate;
	private Date mfrDate;
	private double MRP;
	private String title;

	public UIManufacturer manufacturer;

	public List<UIProductRecipe> productRecipes;

	public List<UIProductDetail> productDetails;

	public List<UIProductVariant> productVariants;

	public List<UIProdLocation> productLocations;

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

	public double getMRP() {
		return MRP;
	}

	public void setMRP(double mRP) {
		MRP = mRP;
	}

	public long getImgDetailId() {
		return imgDetailId;
	}

	public void setImgDetailId(long imgDetailId) {
		this.imgDetailId = imgDetailId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setInventoryAppId(long inventoryAppId) {
		this.inventoryAppId = inventoryAppId;
	}

	public Long getInventoryAppId() {
		return inventoryAppId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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
