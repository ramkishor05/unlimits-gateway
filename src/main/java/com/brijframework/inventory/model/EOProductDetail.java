package com.brijframework.inventory.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"productID"})})
public class EOProductDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public long batchID;
	public double MRP;
	public String manufacturer;
	public Date expDate;
	public Date mfrDate;
	public double unitPrice; 
	public double quantityPerUnit;
	public long unitsInStock; 
	public long unitsInOrder;
	public String Type;
	
	@ManyToOne
	@JoinColumn(name="productID")
	public EOProduct eoProduct;
	
}