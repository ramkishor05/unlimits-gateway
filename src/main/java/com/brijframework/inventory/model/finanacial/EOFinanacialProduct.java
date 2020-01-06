package com.brijframework.inventory.model.finanacial;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.brijframework.inventory.model.global.EOGlobalProduct;

@Entity
public class EOFinanacialProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Double cost;
	private Date busiDate;
	
	@JoinColumn(name="PRODUCT_ID")
	private EOGlobalProduct product;
	
	@OneToMany(mappedBy = "product")
	public List<EOFinanacialProductRecipe> productRecipes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getBusiDate() {
		return busiDate;
	}

	public void setBusiDate(Date busiDate) {
		this.busiDate = busiDate;
	}

	public EOGlobalProduct getProduct() {
		return product;
	}

	public void setProduct(EOGlobalProduct product) {
		this.product = product;
	}

	public List<EOFinanacialProductRecipe> getProductRecipes() {
		return productRecipes;
	}

	public void setProductRecipes(List<EOFinanacialProductRecipe> productRecipes) {
		this.productRecipes = productRecipes;
	}
}
