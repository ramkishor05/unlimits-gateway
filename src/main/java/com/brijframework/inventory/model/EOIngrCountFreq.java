package com.brijframework.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class EOIngrCountFreq implements Serializable{

	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumn(name="IngrID")
	public EOIngr  eoIngr;
	@OneToOne
	@JoinColumn(name="CountFreqID")
	public EOCountFreq eoCountFreq;
	public long id;
}


