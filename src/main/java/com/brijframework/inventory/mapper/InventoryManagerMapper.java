package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIInventoryManager;
import com.brijframework.inventory.model.EOInventoryManager;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryManagerMapper extends GenericMapper<EOInventoryManager, UIInventoryManager>{

	@Override
	@Mapping(source="countFreq", target="countFreq.id")
	@Mapping(source="busiDate" , dateFormat="dd/MM/yyyy", target="busiDate")
	EOInventoryManager mapToDAO(UIInventoryManager eoRoleDTO) ;
	
	@Override
	@Mapping(target="countFreq", source="countFreq.id")
	@Mapping(target="busiDate" , dateFormat="dd/MM/yyyy", source="busiDate")
	UIInventoryManager mapToDTO(EOInventoryManager eoRole);
}
