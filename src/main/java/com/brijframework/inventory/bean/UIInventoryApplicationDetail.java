package com.brijframework.inventory.bean;

import java.util.Set;

public class UIInventoryApplicationDetail extends UIInventoryApplication {

	public Set<UICountFreq> countFreqs;

	public Set<UIUnitGroup> unitGroups;

	public Set<UICountFreq> getCountFreqs() {
		return countFreqs;
	}

	public void setCountFreqs(Set<UICountFreq> countFreqs) {
		this.countFreqs = countFreqs;
	}

	public Set<UIUnitGroup> getUnitGroups() {
		return unitGroups;
	}

	public void setUnitGroups(Set<UIUnitGroup> unitGroups) {
		this.unitGroups = unitGroups;
	}

}
