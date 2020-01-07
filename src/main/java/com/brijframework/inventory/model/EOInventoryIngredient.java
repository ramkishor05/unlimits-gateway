package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.brijframework.inventory.model.global.EOGlobalIngredient;

@Entity
public class EOInventoryIngredient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Double cost;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date busiDate;
	
	@JoinColumn(name="INGREDIENT_ID")
	@OneToOne
	private EOGlobalIngredient ingredient;

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

	public EOGlobalIngredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(EOGlobalIngredient ingredient) {
		this.ingredient = ingredient;
	}
	
	
}
