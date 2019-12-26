package com.brijframework.inventory.bean;

import java.io.Serializable;
import java.util.List;

import com.brijframework.inventory.model.EOIngr;
import com.brijframework.inventory.model.EOIngrCountFreq;
import com.brijframework.inventory.model.EOIngrLocation;

public class UIIngredient implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public String name;
	public  String logoUrl;
	public String description;
	
	public long eoCategory;	
	public long eoBaseUnit;
	public long eoRptUnit;
	public long eoImgDetail;
	
	public List<UILocation> locationArray;
	
	public List<UICountFreq> countFreqArray;
	
	private EOIngr eoIngr;
	
	public UIIngredient(EOIngr eoIngr) {
		this.eoIngr=eoIngr;
		this.fillData();
	}

	private void fillData() {
		this.id=this.eoIngr.id;
		this.idenNo=this.eoIngr.idenNo;
		this.name=this.eoIngr.name;
		this.description=this.eoIngr.description;
		this.logoUrl=this.eoIngr.logURL();
		if(this.eoIngr.eoCategory!=null)
		this.eoCategory=this.eoIngr.eoCategory.id;
		if(this.eoIngr.eoBaseUnit!=null)
		this.eoBaseUnit=this.eoIngr.eoBaseUnit.id;
		if(this.eoIngr.eoRptUnit!=null)
		this.eoRptUnit=this.eoIngr.eoRptUnit.id;
		if(this.eoIngr.eoImgDetail!=null)
		this.eoImgDetail=this.eoIngr.eoImgDetail.id;
	}
	
	public void fillDetail(){
		for(EOIngrCountFreq eoCountFreq:this.eoIngr.eoIngrCountFreqArray){
			UIIngrCountFreq countFreq=new UIIngrCountFreq(eoCountFreq.eoCountFreq);
			countFreq.setIngr(eoCountFreq);
			countFreqArray.add(countFreq);
		}
		for(EOIngrLocation eoIngrLocation:this.eoIngr.eoIngrLocationArray){
			UIIngrLocation location=new UIIngrLocation(eoIngrLocation.eoLocation);
			location.setIngr(eoIngrLocation);
			locationArray.add(location);
		}
	}
	
}

