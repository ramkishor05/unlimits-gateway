package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.inventory.model.global.EOGlobalPreparation;

@Entity
@Table
public class EOInventoryPreparation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private Double cost;
	private Date busiDate;

	@JoinColumn(name = "PREPARATION_ID")
	private EOGlobalPreparation preparation;

	@OneToMany(mappedBy = "preparation")
	public List<EOInventoryPreparationRecipe> preparationRecipes;

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

	public EOGlobalPreparation getPreparation() {
		return preparation;
	}

	public void setPreparation(EOGlobalPreparation preparation) {
		this.preparation = preparation;
	}

	public List<EOInventoryPreparationRecipe> getPreparationRecipes() {
		return preparationRecipes;
	}

	public void setPreparationRecipes(List<EOInventoryPreparationRecipe> preparationRecipes) {
		this.preparationRecipes = preparationRecipes;
	}

}
