package com.brijframework.production.dto;

import com.brijframework.production.dto.global.UIGlobalCountFreq;

public class UIIngrCountFreq extends UIGlobalCountFreq {
	private static final long serialVersionUID = 1L;

	public long ingredientId;
	public long countFreqId;

	public long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(long ingredientId) {
		this.ingredientId = ingredientId;
	}

	public long getCountFreqId() {
		return countFreqId;
	}

	public void setCountFreqId(long countFreqId) {
		this.countFreqId = countFreqId;
	}

}
