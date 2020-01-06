package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UILocation;
import com.brijframework.inventory.model.global.EOGlobalLocation;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryLocationMapper  extends GenericMapper<EOGlobalLocation, UILocation>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Mapping(target="eoStorage.id", source="storageId")
	@Override
	EOGlobalLocation mapToDAO(UILocation uiLocation);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Mapping(source="eoStorage.id", target="storageId")
	@Override
	UILocation mapToDTO(EOGlobalLocation eoInvLocation);
}
