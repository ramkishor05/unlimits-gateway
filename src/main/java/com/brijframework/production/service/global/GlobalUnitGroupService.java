package com.brijframework.production.service.global;

import java.util.List;

import com.brijframework.production.dto.global.UIGlobalUnitGroup;

public interface GlobalUnitGroupService {

	UIGlobalUnitGroup saveUnitGroup(UIGlobalUnitGroup unitGroup);

	UIGlobalUnitGroup getUnitGroup(long id);

	List<UIGlobalUnitGroup> getUnitGroupList();

	UIGlobalUnitGroup getUnitGroup(String typeId);

}
