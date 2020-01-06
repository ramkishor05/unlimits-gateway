package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIStorage;
import com.brijframework.inventory.model.global.EOGlobalStorage;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryStorageMapper  extends GenericMapper<EOGlobalStorage, UIStorage>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Override
	EOGlobalStorage mapToDAO(UIStorage uiStorage);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Override
	UIStorage mapToDTO(EOGlobalStorage eoInvStorage);
}
