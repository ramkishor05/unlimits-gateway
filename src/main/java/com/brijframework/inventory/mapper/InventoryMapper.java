package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;

import com.brijframework.inventory.bean.UIInventory;
import com.brijframework.inventory.model.EOInventory;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryMapper extends GenericMapper<EOInventory, UIInventory>{

}
