package com.brijframework.production.dto;

import com.brijframework.production.dto.cust.UICustLocation;

public class UIIngrLocation extends UICustLocation {

	private static final long serialVersionUID = 1L;

	public long ingredientId;
	public long locationId;

	public long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(long ingredientId) {
		this.ingredientId = ingredientId;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

}
