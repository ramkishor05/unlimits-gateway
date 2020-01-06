package com.brijframework.inventory.model.global;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EOGlobalIngredientCountFreq implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	@OneToOne
	@JoinColumn(name = "IngrID")
	public EOGlobalIngredient ingredient;
	@OneToOne
	@JoinColumn(name = "CountFreqID")
	public EOGlobalCountFreq countFreq;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOGlobalIngredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(EOGlobalIngredient ingredient) {
		this.ingredient = ingredient;
	}

	public EOGlobalCountFreq getCountFreq() {
		return countFreq;
	}

	public void setCountFreq(EOGlobalCountFreq countFreq) {
		this.countFreq = countFreq;
	}

}
