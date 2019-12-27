package com.brijframework.inventory.model;

import java.util.LinkedHashSet;
import java.util.Set;

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

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "idenNo" }) })
public class EOProduct extends EOItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;

	public double price;

	@OneToOne
	@JoinColumn(name = "imgID")
	public EOImgDetail eoImgDetail;

	@ManyToOne
	@JoinColumn(name = "InvAppID")
	public EOInvApp eoInvApp;

	@ManyToOne
	@JoinColumn(name = "category_id" )
	public EOCategory eoCategory;

	@OneToMany(mappedBy = "eoProduct")
	public Set<EORecipe> eoRecipeArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoProduct")
	public Set<EOProductDetail> eoProductDetailArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoProduct")
	public Set<EOProdLocation> eoProdLocationArray = new LinkedHashSet<>();

	public String logURL() {
		return this.eoImgDetail != null ? this.eoImgDetail.url : "";
	}

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

	public EOImgDetail getEoImgDetail() {
		return eoImgDetail;
	}

	public void setEoImgDetail(EOImgDetail eoImgDetail) {
		this.eoImgDetail = eoImgDetail;
	}

	public EOInvApp getEoInvApp() {
		return eoInvApp;
	}

	public void setEoInvApp(EOInvApp eoInvApp) {
		this.eoInvApp = eoInvApp;
	}

	public EOCategory getEoCategory() {
		return eoCategory;
	}

	public void setEoCategory(EOCategory eoCategory) {
		this.eoCategory = eoCategory;
	}

	public Set<EORecipe> getEoRecipeArray() {
		return eoRecipeArray;
	}

	public void setEoRecipeArray(Set<EORecipe> eoRecipeArray) {
		this.eoRecipeArray = eoRecipeArray;
	}

	public Set<EOProductDetail> getEoProductDetailArray() {
		return eoProductDetailArray;
	}

	public void setEoProductDetailArray(Set<EOProductDetail> eoProductDetailArray) {
		this.eoProductDetailArray = eoProductDetailArray;
	}

	public Set<EOProdLocation> getEoProdLocationArray() {
		return eoProdLocationArray;
	}

	public void setEoProdLocationArray(Set<EOProdLocation> eoProdLocationArray) {
		this.eoProdLocationArray = eoProdLocationArray;
	}
	
	
}
