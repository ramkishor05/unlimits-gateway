package com.brijframework.inventory.bean;

import java.io.Serializable;

import com.brijframework.inventory.model.EOProduct;

public class UIProduct implements Serializable{

	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public String name;
	public String logoUrl;
	public String description;
	public long eoImgDetail;
	
	private EOProduct eoProduct;
	public UIProduct(EOProduct eoProduct) {
		this.eoProduct=eoProduct;
		this.fillData();
	}
	private void fillData() {
		this.id=this.eoProduct.id;
		this.idenNo=this.eoProduct.idenNo;
		this.name=this.eoProduct.name;
		this.description=this.eoProduct.description;
		this.logoUrl=this.eoProduct.logURL();
		if(this.eoProduct.eoImgDetail!=null)
		this.eoImgDetail=this.eoProduct.eoImgDetail.id;
	}
}
