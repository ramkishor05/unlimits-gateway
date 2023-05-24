package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;

import com.brijframework.inventory.bean.product.UIProductStock;
import com.brijframework.inventory.model.global.EOGlobalProductStock;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryProductStockMapper  extends GenericMapper<EOGlobalProductStock, UIProductStock>{

	@Override
	EOGlobalProductStock mapToDAO(UIProductStock uiProductStock);
	
	@Override
	UIProductStock mapToDTO(EOGlobalProductStock eoGlobalProductStock);
}
