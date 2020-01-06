package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIUnit;
import com.brijframework.inventory.model.global.EOGlobalUnit;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryUnitMapper  extends GenericMapper<EOGlobalUnit, UIUnit>{

	@Mapping(target="unitGroup.id", source="unitGroupId")
	@Override
	EOGlobalUnit mapToDAO(UIUnit eoRoleDTO);
	
	@Mapping(source="unitGroup.id", target="unitGroupId")
	@Override
	UIUnit mapToDTO(EOGlobalUnit eoRole);
}
