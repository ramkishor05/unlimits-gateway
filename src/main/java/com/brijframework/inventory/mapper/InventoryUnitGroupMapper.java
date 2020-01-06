package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIUnitGroup;
import com.brijframework.inventory.model.global.EOGlobalUnitGroup;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryUnitGroupMapper  extends GenericMapper<EOGlobalUnitGroup, UIUnitGroup>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Override
	EOGlobalUnitGroup mapToDAO(UIUnitGroup eoRoleDTO);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Override
	UIUnitGroup mapToDTO(EOGlobalUnitGroup eoRole);
}
