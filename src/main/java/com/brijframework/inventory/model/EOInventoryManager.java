package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.brijframework.inventory.model.global.EOGlobalCountFreq;

@Entity
public class EOInventoryManager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	private Date busiDate;
	private boolean isPosted;
	private double totalCost; // in cents
	private double totalSales; // Total sales in cents
	private double theoreticalCost; // Theoretical Food Cost in cents
	private double totalInvValue; // in cents
	private long numWarnings;
	private boolean isDirty; // set this to dirty if delivery / menu mix is added / updated / deleted

	@OneToOne
	@JoinColumn(name = "countFreqId", nullable = true)
	private EOGlobalCountFreq countFreq;
	
	@OneToMany(mappedBy = "inventory")
	public Set<EOInventoryItemDetail> itemDetailList;
	
	@OneToMany(mappedBy = "inventory")
	public Set<EOInventoryPrepDetail> prepDetailList;
	
	@OneToMany(mappedBy = "inventory")
	public Set<EOInventoryFinsDetail> finsDetailList;
	
	@OneToOne
	@JoinColumn(name = "EOOpeningInvID", nullable = true)
	private EOInventoryManager openingInv;

	public Date getBusiDate() {
		return busiDate;
	}

	public void setBusiDate(Date busiDate) {
		this.busiDate = busiDate;
	}

	public boolean isPosted() {
		return isPosted;
	}

	public void setPosted(boolean isPosted) {
		this.isPosted = isPosted;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	public double getTheoreticalCost() {
		return theoreticalCost;
	}

	public void setTheoreticalCost(double theoreticalCost) {
		this.theoreticalCost = theoreticalCost;
	}

	public double getTotalInvValue() {
		return totalInvValue;
	}

	public void setTotalInvValue(double totalInvValue) {
		this.totalInvValue = totalInvValue;
	}

	public long getNumWarnings() {
		return numWarnings;
	}

	public void setNumWarnings(long numWarnings) {
		this.numWarnings = numWarnings;
	}

	public boolean isDirty() {
		return isDirty;
	}

	public void setDirty(boolean isDirty) {
		this.isDirty = isDirty;
	}

	public EOGlobalCountFreq getCountFreq() {
		return countFreq;
	}

	public void setCountFreq(EOGlobalCountFreq countFreq) {
		this.countFreq = countFreq;
	}

	public EOInventoryManager getOpeningInv() {
		return openingInv;
	}

	public void setOpeningInv(EOInventoryManager openingInv) {
		this.openingInv = openingInv;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
