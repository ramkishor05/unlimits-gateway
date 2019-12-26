package com.brijframework.inventory.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EOInventory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date busiDate;
	private boolean isPosted;
	private double totalCost; // in cents
	private double totalSales; // Total sales in cents
	private double theoreticalCost; // Theoretical Food Cost in cents
	private double totalInvValue; // in cents
	private long numWarnings;
	private boolean isDirty; // set this to dirty if delivery / menu mix is added / updated / deleted

	private EOCountFreq countFreq;
	
	@OneToOne
	@JoinColumn(name = "EOOpeningInvID", nullable = true)
	private EOInventory openingInv;

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

	public EOCountFreq getCountFreq() {
		return countFreq;
	}

	public void setCountFreq(EOCountFreq countFreq) {
		this.countFreq = countFreq;
	}

	public EOInventory getOpeningInv() {
		return openingInv;
	}

	public void setOpeningInv(EOInventory openingInv) {
		this.openingInv = openingInv;
	}
	
	
	
}
