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
public class EOIngr extends EOItem {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	@ManyToOne
	@JoinColumn(name = "InvAppID", nullable = false)
	public EOInvApp eoInvApp;

	@OneToOne
	@JoinColumn(name = "imgID", nullable = true)
	public EOImgDetail eoImgDetail;

	@OneToOne
	@JoinColumn(name = "BaseUnitID", nullable = true)
	public EOInvUnit eoBaseUnit;

	@OneToOne
	@JoinColumn(name = "RptUnitID", nullable = true)
	public EOInvUnit eoRptUnit;

	@OneToOne
	@JoinColumn(name = "category_id", nullable = false)
	public EOCategory eoCategory;

	@OneToMany(mappedBy = "eoIngr")
	public Set<EOIngrLocation> eoIngrLocationArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoIngr")
	public Set<EOIngrCountFreq> eoIngrCountFreqArray = new LinkedHashSet<>();

	public String logURL() {
		return this.eoImgDetail != null ? this.eoImgDetail.url : "";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOInvApp getEoInvApp() {
		return eoInvApp;
	}

	public void setEoInvApp(EOInvApp eoInvApp) {
		this.eoInvApp = eoInvApp;
	}

	public EOImgDetail getEoImgDetail() {
		return eoImgDetail;
	}

	public void setEoImgDetail(EOImgDetail eoImgDetail) {
		this.eoImgDetail = eoImgDetail;
	}

	public EOInvUnit getEoBaseUnit() {
		return eoBaseUnit;
	}

	public void setEoBaseUnit(EOInvUnit eoBaseUnit) {
		this.eoBaseUnit = eoBaseUnit;
	}

	public EOInvUnit getEoRptUnit() {
		return eoRptUnit;
	}

	public void setEoRptUnit(EOInvUnit eoRptUnit) {
		this.eoRptUnit = eoRptUnit;
	}

	public EOCategory getEoCategory() {
		return eoCategory;
	}

	public void setEoCategory(EOCategory eoCategory) {
		this.eoCategory = eoCategory;
	}

	public Set<EOIngrLocation> getEoIngrLocationArray() {
		return eoIngrLocationArray;
	}

	public void setEoIngrLocationArray(Set<EOIngrLocation> eoIngrLocationArray) {
		this.eoIngrLocationArray = eoIngrLocationArray;
	}

	public Set<EOIngrCountFreq> getEoIngrCountFreqArray() {
		return eoIngrCountFreqArray;
	}

	public void setEoIngrCountFreqArray(Set<EOIngrCountFreq> eoIngrCountFreqArray) {
		this.eoIngrCountFreqArray = eoIngrCountFreqArray;
	}

}
