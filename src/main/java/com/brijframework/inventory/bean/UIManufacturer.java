package com.brijframework.inventory.bean;

public class UIManufacturer {

	public long id;

	private String brand;

	private String gtin; // Global Trade Item Number (GTIN) of the item

	private String mpn; // Manufacturer Part Number (MPN) of the item

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGtin() {
		return gtin;
	}

	public void setGtin(String gtin) {
		this.gtin = gtin;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

}
