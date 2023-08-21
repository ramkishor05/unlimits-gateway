package com.brijframework.production.entities.cust;

import static com.brijframework.production.contants.Constants.CUST_PREPARATION;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.production.contants.Constants.EOCUST_PREPARATION;
import static com.brijframework.production.contants.Constants.GLB_IMG_ID;
import static com.brijframework.production.contants.Constants.NAME;
import static com.brijframework.production.contants.Constants.QNT;

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

import com.brijframework.production.entities.global.EOGlobalMediaDetail;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PREPARATION, uniqueConstraints = { @UniqueConstraint(columnNames = { CUST_PROD_APP_ID, NAME }) })
public class EOCustPreparation extends EOCustItem {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = QNT)
	public Double qnt;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustProductionApp custProductionApp;

	@OneToOne
	@JoinColumn(name = GLB_IMG_ID, nullable = true)
	public EOGlobalMediaDetail glbImgDetail;

	@OneToMany(mappedBy = CUST_PREPARATION)
	public Set<EOCustPreparationLocation> custPreparationLocations;

	@OneToMany(mappedBy = CUST_PREPARATION)
	public Set<EOCustPreparationCountFreq> custPreparationCountFreqs;

	@OneToMany(mappedBy = CUST_PREPARATION)
	public Set<EOCustPreparationRecipe> custPreparationRecipes;

	public String logURL() {
		return this.glbImgDetail != null ? this.glbImgDetail.url : "";
	}

	public Double getQnt() {
		return qnt;
	}

	public void setQnt(Double qnt) {
		this.qnt = qnt;
	}

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

	public Set<EOCustPreparationLocation> getCustPreparationLocations() {
		return custPreparationLocations;
	}

	public void setCustPreparationLocations(Set<EOCustPreparationLocation> custPreparationLocations) {
		this.custPreparationLocations = custPreparationLocations;
	}

	public Set<EOCustPreparationCountFreq> getCustPreparationCountFreqs() {
		return custPreparationCountFreqs;
	}

	public void setCustPreparationCountFreqs(Set<EOCustPreparationCountFreq> custPreparationCountFreqs) {
		this.custPreparationCountFreqs = custPreparationCountFreqs;
	}

	public Set<EOCustPreparationRecipe> getCustPreparationRecipes() {
		return custPreparationRecipes;
	}

	public void setCustPreparationRecipes(Set<EOCustPreparationRecipe> custPreparationRecipes) {
		this.custPreparationRecipes = custPreparationRecipes;
	}

	
}
