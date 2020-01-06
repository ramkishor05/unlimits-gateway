package com.brijframework.inventory.model.global;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "productID" }) })
public class EOGlobalProductDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	/*
	 * public long batchID; public double MRP; public String manufacturer; public
	 * Date expDate; public Date mfrDate; public double unitPrice; public double
	 * quantityPerUnit; public long unitsInStock; public long unitsInOrder; public
	 * String Type;
	 */
	private String sectionName;
	private String attributeName;
	private String attributeValue;

	@ManyToOne
	@JoinColumn(name = "productID")
	public EOGlobalProduct product;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public EOGlobalProduct getProduct() {
		return product;
	}

	public void setProduct(EOGlobalProduct product) {
		this.product = product;
	}

}