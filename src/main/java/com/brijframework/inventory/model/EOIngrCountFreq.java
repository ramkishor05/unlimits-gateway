package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EOIngrCountFreq implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	@OneToOne
	@JoinColumn(name = "IngrID")
	public EOIngredient ingredient;
	@OneToOne
	@JoinColumn(name = "CountFreqID")
	public EOInvCountFreq countFreq;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOIngredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(EOIngredient ingredient) {
		this.ingredient = ingredient;
	}

	public EOInvCountFreq getCountFreq() {
		return countFreq;
	}

	public void setCountFreq(EOInvCountFreq countFreq) {
		this.countFreq = countFreq;
	}

}
