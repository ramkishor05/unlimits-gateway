package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_BASE_UNIT_ID;
import static com.brijframework.inventory.contants.Constants.CUST_CATEGORY_ID;
import static com.brijframework.inventory.contants.Constants.CUST_INGREDIENT;
import static com.brijframework.inventory.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_RPT_UNIT_ID;
import static com.brijframework.inventory.contants.Constants.EOCUST_INGREDIENT;
import static com.brijframework.inventory.contants.Constants.GLB_IMG_ID;
import static com.brijframework.inventory.contants.Constants.IDEN_NO;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = EOCUST_INGREDIENT, uniqueConstraints = { @UniqueConstraint(columnNames = { CUST_PROD_APP_ID, IDEN_NO }) })
public class EOCustIngredient extends EOCustItem {

	private static final long serialVersionUID = 1L;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustInventoryApp custInventoryApp;

	@OneToOne
	@JoinColumn(name = GLB_IMG_ID, nullable = true)
	public EOGlobalMediaDetail glbImgDetail;

	@OneToOne
	@JoinColumn(name = CUST_BASE_UNIT_ID, nullable = true)
	public EOCustUnit custBaseUnit;

	@OneToOne
	@JoinColumn(name = CUST_RPT_UNIT_ID, nullable = true)
	public EOCustUnit custReptUnit;

	@Column(name = CUST_CATEGORY_ID, nullable = false)
	public Long custCategoryId;

	@OneToMany(mappedBy = CUST_INGREDIENT)
	public Set<EOCustIngredientLocation> custIngredientLocations;

	@OneToMany(mappedBy = CUST_INGREDIENT)
	public Set<EOCustIngredientCountFreq> custIngredientCountFreqs;

	public EOGlobalMediaDetail getGlbImgDetail() {
		return glbImgDetail;
	}

	public void setGlbImgDetail(EOGlobalMediaDetail glbImgDetail) {
		this.glbImgDetail = glbImgDetail;
	}

	public EOCustUnit getCustBaseUnit() {
		return custBaseUnit;
	}

	public void setCustBaseUnit(EOCustUnit custBaseUnit) {
		this.custBaseUnit = custBaseUnit;
	}

	public EOCustUnit getCustReptUnit() {
		return custReptUnit;
	}

	public void setCustReptUnit(EOCustUnit custReptUnit) {
		this.custReptUnit = custReptUnit;
	}

	public EOCustInventoryApp getCustInventoryApp() {
		return custInventoryApp;
	}

	public void setCustInventoryApp(EOCustInventoryApp custInventoryApp) {
		this.custInventoryApp = custInventoryApp;
	}

	public Long getCustCategoryId() {
		return custCategoryId;
	}

	public void setCustCategoryId(Long custCategoryId) {
		this.custCategoryId = custCategoryId;
	}

	public Set<EOCustIngredientLocation> getCustIngredientLocations() {
		return custIngredientLocations;
	}

	public void setCustIngredientLocations(Set<EOCustIngredientLocation> custIngredientLocations) {
		this.custIngredientLocations = custIngredientLocations;
	}

	public Set<EOCustIngredientCountFreq> getCustIngredientCountFreqs() {
		return custIngredientCountFreqs;
	}

	public void setCustIngredientCountFreqs(Set<EOCustIngredientCountFreq> custIngredientCountFreqs) {
		this.custIngredientCountFreqs = custIngredientCountFreqs;
	}
}
