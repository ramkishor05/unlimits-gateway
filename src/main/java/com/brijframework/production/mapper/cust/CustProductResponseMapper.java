package com.brijframework.production.mapper.cust;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_ENTITY;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_UI;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.entities.cust.EOCustProduct;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.cust.CustProductResponse;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustProductResponseMapper  extends GenericMapper<EOCustProduct, CustProductResponse>{

	@Mapping(target=CUST_PROD_APP_ID_ENTITY, source=CUST_PROD_APP_ID_UI)
	@Override
	EOCustProduct mapToDAO(CustProductResponse uiProduct);
	
	@Mapping(source=CUST_PROD_APP_ID_ENTITY, target=CUST_PROD_APP_ID_UI)
	@Override
	CustProductResponse mapToDTO(EOCustProduct eoInvProduct);
}
