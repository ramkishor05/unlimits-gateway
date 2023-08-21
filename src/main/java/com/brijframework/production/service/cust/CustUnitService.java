package com.brijframework.production.service.cust;

import java.util.List;

import com.brijframework.production.dto.cust.UICustUnit;

public interface CustUnitService {

	UICustUnit saveUnit(long custAppId, UICustUnit uiCustUnit);

	UICustUnit updateUnit(long custAppId, Long id, UICustUnit uiCustUnit);

	List<UICustUnit> getUnitList(long custAppId);

}
