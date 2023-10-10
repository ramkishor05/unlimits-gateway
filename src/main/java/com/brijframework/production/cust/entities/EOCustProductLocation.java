package com.brijframework.production.cust.entities;

import static com.brijframework.production.contants.Constants.CUST_LOCATION_ID;
import static com.brijframework.production.contants.Constants.CUST_PRODUCT_ID;
import static com.brijframework.production.contants.Constants.EOCUST_PRODUCT_LOCATION;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PRODUCT_LOCATION, uniqueConstraints = {@UniqueConstraint (columnNames = { CUST_PRODUCT_ID, CUST_LOCATION_ID })})
public class EOCustProductLocation extends EOCustObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	@ManyToOne
	@JoinColumn(name=CUST_PRODUCT_ID)
	public EOCustProduct custProduct;
	
	@ManyToOne
	@JoinColumn(name=CUST_LOCATION_ID)
	public EOCustLocation custLocation;

	public EOCustProduct getCustProduct() {
		return custProduct;
	}

	public void setCustProduct(EOCustProduct custProduct) {
		this.custProduct = custProduct;
	}

	public EOCustLocation getCustLocation() {
		return custLocation;
	}

	public void setCustLocation(EOCustLocation custLocation) {
		this.custLocation = custLocation;
	}
	
}