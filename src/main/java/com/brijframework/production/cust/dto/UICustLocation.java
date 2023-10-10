package com.brijframework.production.cust.dto;

import java.io.Serializable;

public class UICustLocation implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String idenNo;
	private float orderSequence;
	private String name;
	private long custProductionAppId;
	private long custStorageId;
	private String typeId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public float getOrderSequence() {
		return orderSequence;
	}

	public void setOrderSequence(float orderSequence) {
		this.orderSequence = orderSequence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCustProductionAppId() {
		return custProductionAppId;
	}

	public void setCustProductionAppId(long custProductionAppId) {
		this.custProductionAppId = custProductionAppId;
	}

	public long getCustStorageId() {
		return custStorageId;
	}

	public void setCustStorageId(long custStorageId) {
		this.custStorageId = custStorageId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}