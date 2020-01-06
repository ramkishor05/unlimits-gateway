package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UICategory;
import com.brijframework.inventory.model.global.EOGlobalCategory;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryCategoryMapper  extends GenericMapper<EOGlobalCategory, UICategory>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Override
	EOGlobalCategory mapToDAO(UICategory eoRoleDTO);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Override
	UICategory mapToDTO(EOGlobalCategory eoRole);
}
