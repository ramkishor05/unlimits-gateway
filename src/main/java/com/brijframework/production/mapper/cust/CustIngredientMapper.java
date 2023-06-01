package com.brijframework.production.mapper.cust;
import static com.brijframework.production.contants.Constants.*;
import static com.brijframework.production.contants.Constants.CUST_BASE_UNIT_ID_UI;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_ENTITY;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_UI;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.dto.cust.UICustIngredient;
import com.brijframework.production.entities.cust.EOCustIngredient;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustIngredientMapper  extends GenericMapper<EOCustIngredient, UICustIngredient>{
	

	@Mapping(target=CUST_PROD_APP_ID_ENTITY, source=CUST_PROD_APP_ID_UI)
	@Mapping(target=CUST_BASE_UNIT_ID_ENTITY, source=CUST_BASE_UNIT_ID_UI)
	@Mapping(target=CUST_REPT_UNIT_ID_ENTITY, source=CUST_REPT_UNIT_ID_UI)
	@Mapping(target=CUST_CATEGORY_ID_ENTITY, source=CUST_CATEGORY_ID_UI)
	@Mapping(target=GLB_IMAGE_ID_ENTITY, source=GLB_IMAGE_ID_UI)
	@Override
	EOCustIngredient mapToDAO(UICustIngredient uiCustIngredient);
	
	@Mapping(source=CUST_PROD_APP_ID_ENTITY, target=CUST_PROD_APP_ID_UI)
	@Mapping(source=CUST_CATEGORY_ID_ENTITY, target=CUST_CATEGORY_ID_UI)
	@Mapping(source=CUST_BASE_UNIT_ID_ENTITY, target=CUST_BASE_UNIT_ID_UI)
	@Mapping(source=CUST_REPT_UNIT_ID_ENTITY, target=CUST_REPT_UNIT_ID_UI)
	@Mapping(source=GLB_IMAGE_ID_ENTITY, target=GLB_IMAGE_ID_UI)
	@Override
	UICustIngredient mapToDTO(EOCustIngredient eoCustIngredient);
}
