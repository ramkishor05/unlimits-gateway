package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIPreparation;
import com.brijframework.inventory.model.global.EOGlobalPreparation;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryPreparationMapper  extends GenericMapper<EOGlobalPreparation, UIPreparation>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Mapping(target="imgDetail.id", source="imgDetailId")
	@Override
	EOGlobalPreparation mapToDAO(UIPreparation uiPreparation);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Mapping(source="imgDetail.id", target="imgDetailId")
	@Override
	UIPreparation mapToDTO(EOGlobalPreparation eoInvPreparation);
}
