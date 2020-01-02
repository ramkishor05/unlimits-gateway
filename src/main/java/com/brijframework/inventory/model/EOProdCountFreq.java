package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EOProdCountFreq implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	@OneToOne
	@JoinColumn(name="ProductID")
	public EOProduct  eoProduct;
	@OneToOne
	@JoinColumn(name="CountFreqID")
	public EOInvCountFreq eoCountFreq;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public EOProduct getEoProduct() {
		return eoProduct;
	}
	public void setEoProduct(EOProduct eoProduct) {
		this.eoProduct = eoProduct;
	}
	public EOInvCountFreq getEoCountFreq() {
		return eoCountFreq;
	}
	public void setEoCountFreq(EOInvCountFreq eoCountFreq) {
		this.eoCountFreq = eoCountFreq;
	}
	
	
}
