package com.brijframework.inventory.model;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class EOInvApp implements Serializable {

	private static final long serialVersionUID = 1L;

/*	@SuppressWarnings("unchecked")
	@Override
	public <T> T postCreate() {
		super.postCreate();
		List<EOLKCountFreq> eolkCountFreqs = (List<EOLKCountFreq>) DBDataProcessor.getProcessor()
				.getAllObject(EOLKCountFreq.class);
		for (EOLKCountFreq eolkCountFreq : eolkCountFreqs) {
			MapBean<String, Object> map = new MapBean<>(eolkCountFreq.objectMap());
			map.put("eoInvApp", this);
			this.addToRel("eoCountFreqArray", map);
		}
		List<EOLKUnitGroup> eolkUnitGroups = (List<EOLKUnitGroup>) DBDataProcessor.getProcessor().getAllObject(EOLKUnitGroup.class);
		for (EOLKUnitGroup eolkUnitGroup : eolkUnitGroups) {
			EOInvUnitGroup eoInvUnitGroup = this.addToRel("eoUnitGroupArray", eolkUnitGroup.objectMapWithKeys("typeID~shortDesc~longDesc~friendlyName"));
			for (EOLKUnit eolkUnit : eolkUnitGroup.eoUnitArray) {
				eoInvUnitGroup.addToRel("eoUnitArray", eolkUnit.objectMapWithKeys("typeID~shortDesc~longDesc~friendlyName"));
			}
		}
		return (T) this;
	}*/

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOCountFreq> eoCountFreqArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOInvUnitGroup> eoUnitGroupArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOProduct> eoProductArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOIngr> eoIngrArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOPrep> eoPrepArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOCategory> eoCategoryArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOCategoryGroup> eoCategoryGroupArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOStorage> eoStorageArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOLocation> eoLocationArray = new LinkedHashSet<>();


}
