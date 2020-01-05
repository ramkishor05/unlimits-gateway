package com.brijframework.inventory.bean;

import java.util.Date;

public class UIInventoryManager {

	private Date busiDate;
	private boolean posted;
	private double totalCost;
	private double totalSales;
	private double theoreticalCost;
	private double totalInvValue;
	private long numWarnings;
	private long countFreq;
	private long inventoryAppId;

	public long getInventoryAppId() {
		return inventoryAppId;
	}

	public void setInventoryAppId(long inventoryAppId) {
		this.inventoryAppId = inventoryAppId;
	}
	
	public Date getBusiDate() {
		return busiDate;
	}

	public void setBusiDate(Date busiDate) {
		this.busiDate = busiDate;
	}

	public boolean isPosted() {
		return posted;
	}

	public void setPosted(boolean posted) {
		this.posted = posted;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busiDate == null) ? 0 : busiDate.hashCode());
		result = prime * result + (int) (countFreq ^ (countFreq >>> 32));
		result = prime * result + (posted ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UIInventoryManager other = (UIInventoryManager) obj;
		if (busiDate == null) {
			if (other.busiDate != null)
				return false;
		} else if (!busiDate.equals(other.busiDate))
			return false;
		if (countFreq != other.countFreq)
			return false;
		if (posted != other.posted)
			return false;
		return true;
	}

	
}
