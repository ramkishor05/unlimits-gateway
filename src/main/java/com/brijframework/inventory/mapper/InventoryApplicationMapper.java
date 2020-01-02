package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;

import com.brijframework.inventory.bean.UIInventoryApplication;
import com.brijframework.inventory.model.EOInventoryApp;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryApplicationMapper extends GenericMapper<EOInventoryApp, UIInventoryApplication>{

}
