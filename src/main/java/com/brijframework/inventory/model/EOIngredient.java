package com.brijframework.inventory.model;

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

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "idenNo" }) })
public class EOIngredient extends EOItem {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	@ManyToOne
	@JoinColumn(name = "APP_ID", nullable = false)
	public EOInventoryApp inventoryApp;

	@OneToOne
	@JoinColumn(name = "IMG_ID", nullable = true)
	public EOImgDetail imgDetail;

	@OneToOne
	@JoinColumn(name = "BASE_UNIT_ID", nullable = true)
	public EOInvUnit baseUnit;

	@OneToOne
	@JoinColumn(name = "RPT_UNIT_ID", nullable = true)
	public EOInvUnit rptUnit;

	@OneToOne
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	public EOCategory category;

	@OneToMany(mappedBy = "ingredient")
	public Set<EOIngrLocation> ingrLocationArray;

	@OneToMany(mappedBy = "ingredient")
	public Set<EOIngrCountFreq> ingrCountFreqArray;

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

	public EOImgDetail getImgDetail() {
		return imgDetail;
	}

	public void setImgDetail(EOImgDetail imgDetail) {
		this.imgDetail = imgDetail;
	}

	public EOInvUnit getBaseUnit() {
		return baseUnit;
	}

	public void setBaseUnit(EOInvUnit baseUnit) {
		this.baseUnit = baseUnit;
	}

	public EOInvUnit getRptUnit() {
		return rptUnit;
	}

	public void setRptUnit(EOInvUnit rptUnit) {
		this.rptUnit = rptUnit;
	}

	public EOCategory getCategory() {
		return category;
	}

	public void setCategory(EOCategory category) {
		this.category = category;
	}

	public Set<EOIngrLocation> getIngrLocationArray() {
		return ingrLocationArray;
	}

	public void setIngrLocationArray(Set<EOIngrLocation> ingrLocationArray) {
		this.ingrLocationArray = ingrLocationArray;
	}

	public Set<EOIngrCountFreq> getIngrCountFreqArray() {
		return ingrCountFreqArray;
	}

	public void setIngrCountFreqArray(Set<EOIngrCountFreq> ingrCountFreqArray) {
		this.ingrCountFreqArray = ingrCountFreqArray;
	}

}
