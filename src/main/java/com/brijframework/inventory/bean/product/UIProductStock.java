package com.brijframework.inventory.bean.product;

public class UIProductStock {

	private Long id;
	private Long quantity_added;
	private Long quantity_remaining;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuantity_added() {
		return quantity_added;
	}

	public void setQuantity_added(Long quantity_added) {
		this.quantity_added = quantity_added;
	}

	public Long getQuantity_remaining() {
		return quantity_remaining;
	}

	public void setQuantity_remaining(Long quantity_remaining) {
		this.quantity_remaining = quantity_remaining;
	}

}
