package com.brijframework.production.entities.cust;

import static com.brijframework.production.contants.Constants.*;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.brijframework.production.entities.global.EOGlobalItem;
import com.brijframework.production.entities.global.EOGlobalMediaDetail;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name=EOCUST_INGREDIENT, uniqueConstraints = { @UniqueConstraint(columnNames = {CUST_PROD_APP_ID, IDEN_NO }) })
public class EOCustIngredient extends EOGlobalItem {


	private static final long serialVersionUID = 1L;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustProductionApp custProductionApp;

	@OneToOne
	@JoinColumn(name = GLB_IMG_ID, nullable = true)
	public EOGlobalMediaDetail glbImgDetail;

	@OneToOne
	@JoinColumn(name = CUST_BASE_UNIT_ID, nullable = true)
	public EOCustUnit custBaseUnit;

	@OneToOne
	@JoinColumn(name = CUST_RPT_UNIT_ID, nullable = true)
	public EOCustUnit custReptUnit;

	@OneToOne
	@JoinColumn(name = CUST_CATEGORY_ID, nullable = false)
	public EOCustCategory custCategory;

	@OneToMany(mappedBy = CUST_INGREDIENT)
	public Set<EOCustIngredientLocation> custIngredientLocations;

	@OneToMany(mappedBy = CUST_INGREDIENT)
	public Set<EOCustIngredientCountFreq> custIngredientCountFreqs;

	public EOCustProductionApp getCustProductionApp() {
		return custProductionApp;
	}

	public void setCustProductionApp(EOCustProductionApp custProductionApp) {
		this.custProductionApp = custProductionApp;
	}

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

	public EOCustCategory getCustCategory() {
		return custCategory;
	}

	public void setCustCategory(EOCustCategory custCategory) {
		this.custCategory = custCategory;
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
