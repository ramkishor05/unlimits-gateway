package com.brijframework.inventory.bean;

public class UIInventory {

	private String busiDate;
	private boolean isPosted;
	private double totalCost;
	private double totalSales;
	private double theoreticalCost;
	private double totalInvValue;
	private long numWarnings;
	private long countFreq;
	
	public String getBusiDate() {
		return busiDate;
	}

	public void setBusiDate(String busiDate) {
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

	public long getCountFreq() {
		return countFreq;
	}

	public void setCountFreq(long countFreq) {
		this.countFreq = countFreq;
	}

	
}
