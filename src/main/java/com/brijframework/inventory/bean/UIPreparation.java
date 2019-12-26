package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

import com.brijframework.inventory.model.EOPrep;

public class UIPreparation implements Serializable{

	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public String name;
	public  String logoUrl;
	public String description;
	public double qnt;
	public long eoImgDetail;

	
	public List<UILocation> locationArray;
	
	private EOPrep eoPrep;
	
	public UIPreparation(EOPrep eoPrep) {
		this.eoPrep=eoPrep;
		this.fillData();
	}
	
	private void fillData() {
		this.id=this.eoPrep.id;
		this.idenNo=this.eoPrep.idenNo;
		this.name=this.eoPrep.name;
		this.description=this.eoPrep.description;
		this.logoUrl=this.eoPrep.logURL();
		if(this.eoPrep.eoImgDetail!=null)
		this.eoImgDetail=this.eoPrep.eoImgDetail.id;
	}
	
}
