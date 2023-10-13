package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_LOCATION;
import static com.brijframework.inventory.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_STORAGE_ID;
import static com.brijframework.inventory.contants.Constants.EOCUST_INGREDIENT_LOCATION;
import static com.brijframework.inventory.contants.Constants.NAME;
import static com.brijframework.inventory.contants.Constants.TYPE_ID;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_INGREDIENT_LOCATION, uniqueConstraints = { @UniqueConstraint(columnNames = { CUST_PROD_APP_ID, NAME }) })
public class EOCustLocation extends EOCustObject {

	private static final long serialVersionUID = 1L;
	@Column(name = NAME)
	public String name;
	
	@Column(name = TYPE_ID)
	public String typeId;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustInventoryApp custInventoryApp;

	@ManyToOne
	@JoinColumn(name = CUST_STORAGE_ID, nullable = false)
	public EOCustStorage custStorage;

	@OneToMany(mappedBy = CUST_LOCATION)
	public Set<EOCustIngredientLocation> custIngredientLocations;

	@OneToMany(mappedBy = CUST_LOCATION)
	public Set<EOCustPreparationLocation> custPreparationLocations;

	@OneToMany(mappedBy = CUST_LOCATION)
	public Set<EOCustProductLocation> custProductLocations;

	public EOCustInventoryApp getCustInventoryApp() {
		return custInventoryApp;
	}

	public void setCustInventoryApp(EOCustInventoryApp custInventoryApp) {
		this.custInventoryApp = custInventoryApp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public EOCustStorage getCustStorage() {
		return custStorage;
	}

	public void setCustStorage(EOCustStorage custStorage) {
		this.custStorage = custStorage;
	}

	public Set<EOCustIngredientLocation> getCustIngredientLocations() {
		return custIngredientLocations;
	}

	public void setCustIngredientLocations(Set<EOCustIngredientLocation> custIngredientLocations) {
		this.custIngredientLocations = custIngredientLocations;
	}

	public Set<EOCustPreparationLocation> getCustPreparationLocations() {
		return custPreparationLocations;
	}

	public void setCustPreparationLocations(Set<EOCustPreparationLocation> custPreparationLocations) {
		this.custPreparationLocations = custPreparationLocations;
	}

	public Set<EOCustProductLocation> getCustProductLocations() {
		return custProductLocations;
	}

	public void setCustProductLocations(Set<EOCustProductLocation> custProductLocations) {
		this.custProductLocations = custProductLocations;
	}
	
}
