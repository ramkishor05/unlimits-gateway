package com.brijframework.inventory.model.global;

import java.util.Date;
import java.util.List;

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
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "idenNo" }) })
public class EOGlobalProduct extends EOGlobalItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	
	private double price;
	
	private Date expDate;

	private Date mfrDate;

	private double MRP;

	@OneToOne
	@JoinColumn(name = "imgID")
	public EOGlobalMediaDetail imgDetail;

	@OneToOne
	@JoinColumn(name = "manufacturer_id")
	public EOGlobalManufacturer manufacturer;

	@ManyToOne
	@JoinColumn(name = "InvAppID")
	public EOInventoryApp inventoryApp;

	@OneToOne
	@JoinColumn(name = "category_id")
	public EOGlobalCategory category;

	@OneToMany(mappedBy = "product")
	public List<EOGlobalProductRecipe> productRecipes;

	@OneToMany(mappedBy = "product")
	public List<EOGlobalProductDetail> productDetails;

	@OneToMany(mappedBy = "product")
	public List<EOGlobalProductVariant> productVariants;

	@OneToMany(mappedBy = "product")
	public List<EOGlobalProductLocation> productLocations;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public EOGlobalMediaDetail getImgDetail() {
		return imgDetail;
	}

	public void setImgDetail(EOGlobalMediaDetail imgDetail) {
		this.imgDetail = imgDetail;
	}

	public void setManufacturer(EOGlobalManufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public EOGlobalManufacturer getManufacturer() {
		return manufacturer;
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
