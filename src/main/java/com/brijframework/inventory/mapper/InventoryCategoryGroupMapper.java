package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UICategoryGroup;
import com.brijframework.inventory.model.global.EOGlobalCategoryGroup;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryCategoryGroupMapper  extends GenericMapper<EOGlobalCategoryGroup, UICategoryGroup>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Override
	EOGlobalCategoryGroup mapToDAO(UICategoryGroup eoRoleDTO);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Override
	UICategoryGroup mapToDTO(EOGlobalCategoryGroup eoRole);
}
