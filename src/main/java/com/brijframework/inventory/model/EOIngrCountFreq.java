package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EOIngrCountFreq implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	@OneToOne
	@JoinColumn(name = "IngrID")
	public EOIngr eoIngr;
	@OneToOne
	@JoinColumn(name = "CountFreqID")
	public EOCountFreq eoCountFreq;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOIngr getEoIngr() {
		return eoIngr;
	}

	public void setEoIngr(EOIngr eoIngr) {
		this.eoIngr = eoIngr;
	}

	public EOCountFreq getEoCountFreq() {
		return eoCountFreq;
	}

	public void setEoCountFreq(EOCountFreq eoCountFreq) {
		this.eoCountFreq = eoCountFreq;
	}

}
