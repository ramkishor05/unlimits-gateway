package com.brijframework.inventory.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.bean.UIIngredient;
import com.brijframework.inventory.model.global.EOGlobalIngredient;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.inventory.mapper.impl")
public interface InventoryIngredientMapper  extends GenericMapper<EOGlobalIngredient, UIIngredient>{

	@Mapping(target="inventoryApp.id", source="inventoryAppId")
	@Mapping(target="baseUnit.id", source="baseUnitId")
	@Mapping(target="rptUnit.id", source="rptUnitId")
	@Mapping(target="category.id", source="categoryId")
	@Mapping(target="imgDetail.id", source="imgDetailId")
	@Override
	EOGlobalIngredient mapToDAO(UIIngredient uiIngredient);
	
	@Mapping(source="inventoryApp.id", target="inventoryAppId")
	@Mapping(source="baseUnit.id", target="baseUnitId")
	@Mapping(source="rptUnit.id", target="rptUnitId")
	@Mapping(source="category.id", target="categoryId")
	@Mapping(source="imgDetail.id", target="imgDetailId")
	@Override
	UIIngredient mapToDTO(EOGlobalIngredient eoInvIngredient);
}
