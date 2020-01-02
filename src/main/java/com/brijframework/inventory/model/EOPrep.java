package com.brijframework.inventory.model;

import java.util.LinkedHashSet;
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
public class EOPrep extends EOItem {

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
	public EOImgDetail eoImgDetail;

	@OneToMany(mappedBy = "prep")
	public Set<EOPrepLocation> eoPrepLocationArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoPrep")
	public Set<EOPrepCountFreq> eoPrepCountFreqArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoPrep")
	public Set<EORecipe> eoRecipeArray = new LinkedHashSet<>();

	public String logURL() {
		return this.eoImgDetail != null ? this.eoImgDetail.url : "";
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

	public EOImgDetail getEoImgDetail() {
		return eoImgDetail;
	}

	public void setEoImgDetail(EOImgDetail eoImgDetail) {
		this.eoImgDetail = eoImgDetail;
	}

	public Set<EOPrepLocation> getEoPrepLocationArray() {
		return eoPrepLocationArray;
	}

	public void setEoPrepLocationArray(Set<EOPrepLocation> eoPrepLocationArray) {
		this.eoPrepLocationArray = eoPrepLocationArray;
	}

	public Set<EOPrepCountFreq> getEoPrepCountFreqArray() {
		return eoPrepCountFreqArray;
	}

	public void setEoPrepCountFreqArray(Set<EOPrepCountFreq> eoPrepCountFreqArray) {
		this.eoPrepCountFreqArray = eoPrepCountFreqArray;
	}

	public Set<EORecipe> getEoRecipeArray() {
		return eoRecipeArray;
	}

	public void setEoRecipeArray(Set<EORecipe> eoRecipeArray) {
		this.eoRecipeArray = eoRecipeArray;
	}

}
