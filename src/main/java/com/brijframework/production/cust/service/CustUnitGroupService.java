package com.brijframework.production.cust.service;

import java.util.List;

import com.brijframework.production.cust.dto.UICustUnitGroup;

public interface CustUnitGroupService {

	UICustUnitGroup saveUnitGroup(long custAppId, UICustUnitGroup uiCustUnitGroup);

	UICustUnitGroup updateUnitGroup(long custAppId, UICustUnitGroup uiCustUnitGroup);

	List<UICustUnitGroup> getUnitGroupList(long custAppId);

	List<UICustUnitGroup> getUnitGroupList(long custAppId, String typeId);

}
