package com.brijframework.production.cust.entities;

import static com.brijframework.production.contants.Constants.CUST_COUNT_FREQ_ID;
import static com.brijframework.production.contants.Constants.CUST_PREP_ID;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.production.contants.Constants.EOCUST_PREPARATION_COUNT_FREQ;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PREPARATION_COUNT_FREQ, uniqueConstraints = {
		@UniqueConstraint(columnNames = { CUST_PROD_APP_ID, CUST_PREP_ID, CUST_COUNT_FREQ_ID }) })
public class EOCustPreparationCountFreq extends EOCustObject {

	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = CUST_PREP_ID)
	public EOCustPreparation custPreparation;

	@OneToOne
	@JoinColumn(name = CUST_COUNT_FREQ_ID)
	public EOCustCountFreq custCountFreq;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustProductionApp custProductionApp;

	public EOCustPreparation getCustPreparation() {
		return custPreparation;
	}

	public void setCustPreparation(EOCustPreparation custPreparation) {
		this.custPreparation = custPreparation;
	}

	public EOCustCountFreq getCustCountFreq() {
		return custCountFreq;
	}

	public void setCustCountFreq(EOCustCountFreq custCountFreq) {
		this.custCountFreq = custCountFreq;
	}

	public EOCustProductionApp getCustProductionApp() {
		return custProductionApp;
	}

	public void setCustProductionApp(EOCustProductionApp custProductionApp) {
		this.custProductionApp = custProductionApp;
	}

}
