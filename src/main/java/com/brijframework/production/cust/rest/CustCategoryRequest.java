package com.brijframework.production.cust.rest;

import java.io.Serializable;

public class CustCategoryRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public String name;
	public String desc;
	public String typeId;
	public long custImageDetailId;
	public long custCategoryGroupId;

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

	public long getCustImageDetailId() {
		return custImageDetailId;
	}

	public void setCustImageDetailId(long custImageDetailId) {
		this.custImageDetailId = custImageDetailId;
	}

	public long getCustCategoryGroupId() {
		return custCategoryGroupId;
	}

	public void setCustCategoryGroupId(long custCategoryGroupId) {
		this.custCategoryGroupId = custCategoryGroupId;
	}

}
