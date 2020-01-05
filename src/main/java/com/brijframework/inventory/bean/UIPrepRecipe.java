package com.brijframework.inventory.bean;

public class UIPrepRecipe {

	private long id;

	private float qnt;

	private long preparationId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getQnt() {
		return qnt;
	}

	public void setQnt(float qnt) {
		this.qnt = qnt;
	}

	public long getPreparationId() {
		return preparationId;
	}

	public void setPreparationId(long preparationId) {
		this.preparationId = preparationId;
	}

}
