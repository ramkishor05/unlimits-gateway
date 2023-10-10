package com.brijframework.production.global.service;

import java.util.List;

import com.brijframework.production.global.dto.UIGlobalUnit;
import com.brijframework.production.global.entities.EOGlobalUnitGroup;

public interface GlobalUnitService {

	UIGlobalUnit saveUnit(UIGlobalUnit uiUnit);

	List<UIGlobalUnit> getUnitList();

	UIGlobalUnit saveUnit(EOGlobalUnitGroup eoUnitGroup, UIGlobalUnit unit);

	UIGlobalUnit updateUnit(Long id, UIGlobalUnit uiUnit);

}
