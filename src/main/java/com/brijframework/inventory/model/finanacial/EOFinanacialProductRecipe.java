package com.brijframework.inventory.model.finanacial;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.brijframework.inventory.model.EOInventoryIngredient;
import com.brijframework.inventory.model.EOInventoryPreparation;

@Entity
public class EOFinanacialProductRecipe implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private float qnt;
	
	@OneToOne
	@JoinColumn(name="INGREDIENT_ID")
	private EOInventoryIngredient ingredient;
	
	@ManyToOne
	@JoinColumn(name="PREPARATION_ID")
	private EOInventoryPreparation preparation;
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID", nullable=false)
	private EOFinanacialProduct product;
	
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

	public EOInventoryPreparation getPreparation() {
		return preparation;
	}

	public void setPreparation(EOInventoryPreparation preparation) {
		this.preparation = preparation;
	}
	
	public void setIngredient(EOInventoryIngredient ingredient) {
		this.ingredient = ingredient;
	}
	
	public EOInventoryIngredient getIngredient() {
		return ingredient;
	}

}
