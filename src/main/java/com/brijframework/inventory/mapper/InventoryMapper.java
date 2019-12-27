package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIInventory;
import com.brijframework.inventory.model.EOInventory;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryMapper extends GenericMapper<EOInventory, UIInventory>{

	@Override
	@Mapping(source="countFreq", target="countFreq.id")
	@Mapping(source="busiDate" , dateFormat="dd/MM/yyyy", target="busiDate")
	EOInventory mapToDAO(UIInventory eoRoleDTO) ;
	
	@Override
	@Mapping(target="countFreq", source="countFreq.id")
	@Mapping(target="busiDate" , dateFormat="dd/MM/yyyy", source="busiDate")
	UIInventory mapToDTO(EOInventory eoRole);
}
