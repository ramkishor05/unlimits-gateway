package com.brijframework.production.rest.cust;

import java.io.Serializable;

import com.brijframework.production.dto.cust.UICustCategoryGroup;
import com.brijframework.production.dto.cust.UICustMediaDetail;

public class CustCategoryResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	public long id;
	public String idenNo;
	public String name;
	public String desc;
	public String typeId;
	public UICustMediaDetail custMediaDetail;
	public UICustCategoryGroup custCategoryGroup;

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

	public UICustMediaDetail getCustMediaDetail() {
		return custMediaDetail;
	}

	public void setCustMediaDetail(UICustMediaDetail custMediaDetail) {
		this.custMediaDetail = custMediaDetail;
	}

	public UICustCategoryGroup getCustCategoryGroup() {
		return custCategoryGroup;
	}

	public void setCustCategoryGroup(UICustCategoryGroup custCategoryGroup) {
		this.custCategoryGroup = custCategoryGroup;
	}
}
