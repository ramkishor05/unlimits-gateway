package com.brijframework.production.entities.cust;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID;
import static com.brijframework.production.contants.Constants.DESC;
import static com.brijframework.production.contants.Constants.EOCUST_COUNT_FREQ;
import static com.brijframework.production.contants.Constants.NAME;
import static com.brijframework.production.contants.Constants.TYPE_ID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.brijframework.production.entities.EOEntityObject;

@Entity
@Table(name = EOCUST_COUNT_FREQ, uniqueConstraints = {@UniqueConstraint (columnNames = {CUST_PROD_APP_ID, NAME})})
public class EOCustCountFreq extends EOEntityObject{
	

	private static final long serialVersionUID = 1L;
	
	@Column(name = NAME)
	public String name;
	
	@Column(name = DESC)
	public String desc;
	
	@Column(name = TYPE_ID)
	public String typeId;

	@JoinColumn(name = CUST_PROD_APP_ID, nullable = false)
	@ManyToOne
	private EOCustProductionApp custProductionApp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public EOCustProductionApp getCustProductionApp() {
		return custProductionApp;
	}

	public void setCustProductionApp(EOCustProductionApp custProductionApp) {
		this.custProductionApp = custProductionApp;
	}
	
}
