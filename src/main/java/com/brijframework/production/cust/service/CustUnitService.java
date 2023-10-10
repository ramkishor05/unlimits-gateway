package com.brijframework.production.cust.service;

import java.util.List;

import com.brijframework.production.cust.dto.UICustUnit;

public interface CustUnitService {

	UICustUnit saveUnit(long custAppId, UICustUnit uiCustUnit);

	UICustUnit updateUnit(long custAppId, Long id, UICustUnit uiCustUnit);

	List<UICustUnit> getUnitList(long custAppId);

}
