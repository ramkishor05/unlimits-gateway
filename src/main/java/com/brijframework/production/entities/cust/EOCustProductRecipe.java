package com.brijframework.production.entities.cust;

import static com.brijframework.production.contants.Constants.CUST_INGR_ID;
import static com.brijframework.production.contants.Constants.CUST_LOCATION_ID;
import static com.brijframework.production.contants.Constants.CUST_PREP_ID;
import static com.brijframework.production.contants.Constants.CUST_PRODUCT_ID;
import static com.brijframework.production.contants.Constants.EOCUST_PRODUCT_RECIPE;
import static com.brijframework.production.contants.Constants.QNT;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.brijframework.production.entities.EOEntityObject;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PRODUCT_RECIPE, uniqueConstraints = {@UniqueConstraint (columnNames = { 
		CUST_PREP_ID, CUST_INGR_ID, CUST_PRODUCT_ID })})
public class EOCustProductRecipe extends EOEntityObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = QNT)
	private Long qnt; 
	
	@OneToOne
	@JoinColumn(name=CUST_PREP_ID)
	private EOCustPreparation custPreparation;
	
	@OneToOne
	@JoinColumn(name=CUST_INGR_ID)
	private EOCustIngredient custIngredient;

	@ManyToOne
 	@JoinColumn(name=CUST_PRODUCT_ID)
	private EOCustProduct custProduct;

	public Long getQnt() {
		return qnt;
	}

	public void setQnt(Long qnt) {
		this.qnt = qnt;
	}

	public EOCustPreparation getCustPreparation() {
		return custPreparation;
	}

	public void setCustPreparation(EOCustPreparation custPreparation) {
		this.custPreparation = custPreparation;
	}

	public EOCustIngredient getCustIngredient() {
		return custIngredient;
	}

	public void setCustIngredient(EOCustIngredient custIngredient) {
		this.custIngredient = custIngredient;
	}

	public EOCustProduct getCustProduct() {
		return custProduct;
	}

	public void setCustProduct(EOCustProduct custProduct) {
		this.custProduct = custProduct;
	}

	
}
