package com.brijframework.production.dto.cust;

import java.util.Set;

import com.brijframework.production.dto.UIGlobalCountFreq;
import com.brijframework.production.dto.UIGlobalUnitGroup;

public class UICustProductionAppDetail extends UICustProductionApp {

	public Set<UIGlobalCountFreq> countFreqs;

	public Set<UIGlobalUnitGroup> unitGroups;

	public Set<UIGlobalCountFreq> getCountFreqs() {
		return countFreqs;
	}

	public void setCountFreqs(Set<UIGlobalCountFreq> countFreqs) {
		this.countFreqs = countFreqs;
	}

	public Set<UIGlobalUnitGroup> getUnitGroups() {
		return unitGroups;
	}

	public void setUnitGroups(Set<UIGlobalUnitGroup> unitGroups) {
		this.unitGroups = unitGroups;
	}

}
