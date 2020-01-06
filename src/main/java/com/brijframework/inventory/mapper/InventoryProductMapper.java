package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIProduct;
import com.brijframework.inventory.model.global.EOGlobalProduct;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryProductMapper  extends GenericMapper<EOGlobalProduct, UIProduct>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Override
	EOGlobalProduct mapToDAO(UIProduct uiProduct);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Override
	UIProduct mapToDTO(EOGlobalProduct eoInvProduct);
}
