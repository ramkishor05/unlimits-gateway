package com.brijframework.production.entities.cust;

import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.production.contants.Constants.CUST_STORAGE;
import static com.brijframework.production.contants.Constants.EOCUST_STORAGE;
import static com.brijframework.production.contants.Constants.IDEN_NO;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.brijframework.production.entities.EOGlobalItem;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_STORAGE, uniqueConstraints = {
		@UniqueConstraint (columnNames = { 
				CUST_PROD_APP_ID, IDEN_NO })})
public class EOCustStorage extends EOGlobalItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name=CUST_PROD_APP_ID, nullable=false)
    public EOCustProductionApp custProductionApp;
	
	@OneToMany(mappedBy=CUST_STORAGE)
	public Set<EOCustLocation> custLocations;

	public EOCustProductionApp getCustProductionApp() {
		return custProductionApp;
	}

	public void setCustProductionApp(EOCustProductionApp custProductionApp) {
		this.custProductionApp = custProductionApp;
	}

	public Set<EOCustLocation> getCustLocations() {
		return custLocations;
	}

	public void setCustLocations(Set<EOCustLocation> custLocations) {
		this.custLocations = custLocations;
	}

}
