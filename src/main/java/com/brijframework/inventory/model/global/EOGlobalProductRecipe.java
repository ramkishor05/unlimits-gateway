package com.brijframework.inventory.model.global;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public  class EOGlobalProductRecipe implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private float qnt; 
	
	@OneToOne
	@JoinColumn(name="PREPARATION_ID")
	private EOGlobalPreparation preparation;
	
	@OneToOne
	@JoinColumn(name="INGREDIENT_ID")
	private EOGlobalIngredient ingredient;

	@ManyToOne
	@JoinColumn(name="ProductID")
	private EOGlobalProduct product;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getQnt() {
		return qnt;
	}

	public void setQnt(float qnt) {
		this.qnt = qnt;
	}

	public EOGlobalProduct getProduct() {
		return product;
	}

	public void setProduct(EOGlobalProduct product) {
		this.product = product;
	}

	public EOGlobalPreparation getPreparation() {
		return preparation;
	}

	public void setPreparation(EOGlobalPreparation preparation) {
		this.preparation = preparation;
	}

	public EOGlobalIngredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(EOGlobalIngredient ingredient) {
		this.ingredient = ingredient;
	}
	
}
