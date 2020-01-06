package com.brijframework.inventory.model.global;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EOGlobalProductCountFreq implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	@OneToOne
	@JoinColumn(name="ProductID")
	public EOGlobalProduct  eoProduct;
	
	@OneToOne
	@JoinColumn(name="CountFreqID")
	public EOGlobalCountFreq eoCountFreq;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public EOGlobalProduct getEoProduct() {
		return eoProduct;
	}
	public void setEoProduct(EOGlobalProduct eoProduct) {
		this.eoProduct = eoProduct;
	}
	public EOGlobalCountFreq getEoCountFreq() {
		return eoCountFreq;
	}
	public void setEoCountFreq(EOGlobalCountFreq eoCountFreq) {
		this.eoCountFreq = eoCountFreq;
	}
	
}
