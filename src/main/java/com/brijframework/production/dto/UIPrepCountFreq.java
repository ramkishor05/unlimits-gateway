package com.brijframework.production.dto;

import com.brijframework.production.dto.global.UIGlobalCountFreq;

public class UIPrepCountFreq extends UIGlobalCountFreq {
	private static final long serialVersionUID = 1L;

	public long preparationId;
	public long countFreqId;

	public long getPreparationId() {
		return preparationId;
	}

	public void setPreparationId(long preparationId) {
		this.preparationId = preparationId;
	}

	public long getCountFreqId() {
		return countFreqId;
	}

	public void setCountFreqId(long countFreqId) {
		this.countFreqId = countFreqId;
	}

}