package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.dto.cust.UICustUnitGroup;

public interface CustUnitGroupService {

	UICustUnitGroup saveUnitGroup(long custAppId, UICustUnitGroup uiCustUnitGroup);

	UICustUnitGroup updateUnitGroup(long custAppId, UICustUnitGroup uiCustUnitGroup);

	List<UICustUnitGroup> getUnitGroupList(long custAppId);

	List<UICustUnitGroup> getUnitGroupList(long custAppId, String typeId);

}
