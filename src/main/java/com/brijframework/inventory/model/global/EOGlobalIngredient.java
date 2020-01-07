package com.brijframework.inventory.model.global;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.brijframework.inventory.model.EOInventoryApp;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "idenNo" }) })
public class EOGlobalIngredient extends EOGlobalItem {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	@ManyToOne
	@JoinColumn(name = "APP_ID", nullable = false)
	public EOInventoryApp inventoryApp;

	@OneToOne
	@JoinColumn(name = "IMG_ID", nullable = true)
	public EOGlobalMediaDetail imgDetail;

	@OneToOne
	@JoinColumn(name = "BASE_UNIT_ID", nullable = true)
	public EOGlobalUnit baseUnit;

	@OneToOne
	@JoinColumn(name = "RPT_UNIT_ID", nullable = true)
	public EOGlobalUnit rptUnit;

	@OneToOne
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	public EOGlobalCategory category;

	@OneToMany(mappedBy = "ingredient")
	public Set<EOGlobalIngredientLocation> locations;

	@OneToMany(mappedBy = "ingredient")
	public Set<EOGlobalIngredientCountFreq> countFreqs;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOInventoryApp getInventoryApp() {
		return inventoryApp;
	}

	public void setInventoryApp(EOInventoryApp inventoryApp) {
		this.inventoryApp = inventoryApp;
	}

	public EOGlobalMediaDetail getImgDetail() {
		return imgDetail;
	}

	public void setImgDetail(EOGlobalMediaDetail imgDetail) {
		this.imgDetail = imgDetail;
	}

	public EOGlobalUnit getBaseUnit() {
		return baseUnit;
	}

	public void setBaseUnit(EOGlobalUnit baseUnit) {
		this.baseUnit = baseUnit;
	}

	public EOGlobalUnit getRptUnit() {
		return rptUnit;
	}

	public void setRptUnit(EOGlobalUnit rptUnit) {
		this.rptUnit = rptUnit;
	}

	public EOGlobalCategory getCategory() {
		return category;
	}

	public void setCategory(EOGlobalCategory category) {
		this.category = category;
	}

	public Set<EOGlobalIngredientLocation> getLocations() {
		return locations;
	}

	public void setLocations(Set<EOGlobalIngredientLocation> locations) {
		this.locations = locations;
	}

	public Set<EOGlobalIngredientCountFreq> getCountFreqs() {
		return countFreqs;
	}

	public void setCountFreqs(Set<EOGlobalIngredientCountFreq> countFreqs) {
		this.countFreqs = countFreqs;
	}

}
