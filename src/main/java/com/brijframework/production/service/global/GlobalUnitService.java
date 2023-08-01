package com.brijframework.production.service.global;

import java.util.List;

import com.brijframework.production.dto.global.UIGlobalUnit;
import com.brijframework.production.entities.global.EOGlobalUnitGroup;

public interface GlobalUnitService {

	UIGlobalUnit saveUnit(UIGlobalUnit uiUnit);

	List<UIGlobalUnit> getUnitList();

	UIGlobalUnit saveUnit(EOGlobalUnitGroup eoUnitGroup, UIGlobalUnit unit);

	UIGlobalUnit updateUnit(Long id, UIGlobalUnit uiUnit);

}
