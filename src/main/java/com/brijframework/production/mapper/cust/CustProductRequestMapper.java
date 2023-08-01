package com.brijframework.production.mapper.cust;

import static com.brijframework.production.contants.Constants.*;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_ENTITY;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_UI;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.entities.cust.EOCustProduct;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.cust.CustProductRequest;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustProductRequestMapper  extends GenericMapper<EOCustProduct, CustProductRequest>{

	@Mapping(target=CUST_PROD_APP_ID_ENTITY, source=CUST_PROD_APP_ID_UI)
	@Mapping(target=CUST_PURCHASE_UNIT_ID_ENTITY, source=CUST_PURCHASE_UNIT_ID_UI)
	@Mapping(target=CUST_RETAIL_UNIT_ID_ENTITY, source=CUST_RETAIL_UNIT_ID_UI)
	@Mapping(target=CUST_WHOLE_UNIT_ID_ENTITY, source=CUST_WHOLE_UNIT_ID_UI)
	@Override
	EOCustProduct mapToDAO(CustProductRequest uiProduct);
	
	@Mapping(source=CUST_PROD_APP_ID_ENTITY, target=CUST_PROD_APP_ID_UI)
	@Mapping(source=CUST_PURCHASE_UNIT_ID_ENTITY, target=CUST_PURCHASE_UNIT_ID_UI)
	@Mapping(source=CUST_RETAIL_UNIT_ID_ENTITY, target=CUST_RETAIL_UNIT_ID_UI)
	@Mapping(source=CUST_WHOLE_UNIT_ID_ENTITY, target=CUST_WHOLE_UNIT_ID_UI)
	@Override
	CustProductRequest mapToDTO(EOCustProduct eoInvProduct);
	
}
