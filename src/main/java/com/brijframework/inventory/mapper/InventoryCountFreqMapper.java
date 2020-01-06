package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UICountFreq;
import com.brijframework.inventory.model.global.EOGlobalCountFreq;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryCountFreqMapper  extends GenericMapper<EOGlobalCountFreq, UICountFreq>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Override
	EOGlobalCountFreq mapToDAO(UICountFreq eoRoleDTO);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Override
    UICountFreq mapToDTO(EOGlobalCountFreq eoRole);
}
