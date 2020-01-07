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
public class EOGlobalPreparation extends EOGlobalItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	public double qnt;

	@ManyToOne
	@JoinColumn(name = "InvAppID")
	public EOInventoryApp inventoryApp;

	@OneToOne
	@JoinColumn(name = "imgID", nullable = true)
	public EOGlobalMediaDetail imgDetail;

	@OneToMany(mappedBy = "preparation")
	public Set<EOGlobalPreparationLocation> locations;

	@OneToMany(mappedBy = "preparation")
	public Set<EOGlobalPreparationCountFreq> countFreqs;

	@OneToMany(mappedBy = "preparation")
	public Set<EOGlobalPreparationRecipe> recipes;

	public String logURL() {
		return this.imgDetail != null ? this.imgDetail.url : "";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getQnt() {
		return qnt;
	}

	public void setQnt(double qnt) {
		this.qnt = qnt;
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

	public Set<EOGlobalPreparationLocation> getLocations() {
		return locations;
	}

	public void setLocations(Set<EOGlobalPreparationLocation> locations) {
		this.locations = locations;
	}

	public Set<EOGlobalPreparationCountFreq> getCountFreqs() {
		return countFreqs;
	}

	public void setCountFreqs(Set<EOGlobalPreparationCountFreq> countFreqs) {
		this.countFreqs = countFreqs;
	}

	public Set<EOGlobalPreparationRecipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(Set<EOGlobalPreparationRecipe> recipes) {
		this.recipes = recipes;
	}

}
