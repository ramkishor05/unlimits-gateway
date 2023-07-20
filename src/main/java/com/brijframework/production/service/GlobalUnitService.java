package com.brijframework.production.service;

import java.util.List;

import com.brijframework.production.dto.UIGlobalUnit;
import com.brijframework.production.entities.EOGlobalUnitGroup;

public interface GlobalUnitService {

	UIGlobalUnit saveUnit(UIGlobalUnit uiUnit);

	List<UIGlobalUnit> getUnitList();

	UIGlobalUnit saveUnit(EOGlobalUnitGroup eoUnitGroup, UIGlobalUnit unit);

}
