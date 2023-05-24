package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIProduct;
import com.brijframework.inventory.model.global.EOCustProduct;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryProductMapper  extends GenericMapper<EOCustProduct, UIProduct>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Override
	EOCustProduct mapToDAO(UIProduct uiProduct);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Override
	UIProduct mapToDTO(EOCustProduct eoInvProduct);
}
