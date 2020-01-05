package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;

import com.brijframework.inventory.bean.UIInventoryApplicationDetail;
import com.brijframework.inventory.model.EOInventoryApp;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryApplicationDetailMapper extends GenericMapper<EOInventoryApp, UIInventoryApplicationDetail>{

}
