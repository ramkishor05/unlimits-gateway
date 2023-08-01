package com.brijframework.production.mapper.cust;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_ENTITY;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_UI;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.entities.cust.EOCustProductRetailSale;
import com.brijframework.production.entities.cust.EOCustProductSale;
import com.brijframework.production.entities.cust.EOCustProductWholeSale;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.cust.CustProductRetailSaleRequest;
import com.brijframework.production.rest.cust.CustProductRetailSaleResponse;
import com.brijframework.production.rest.cust.CustProductSaleResponse;
import com.brijframework.production.rest.cust.CustProductWholeSaleRequest;
import com.brijframework.production.rest.cust.CustProductWholeSaleResponse;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustProductSaleResponseMapper  extends GenericMapper<EOCustProductSale, CustProductSaleResponse>{

	@Mapping(target=CUST_PROD_APP_ID_ENTITY, source=CUST_PROD_APP_ID_UI)
	@Override
	EOCustProductSale mapToDAO(CustProductSaleResponse uiProduct);
	
	@Mapping(source=CUST_PROD_APP_ID_ENTITY, target=CUST_PROD_APP_ID_UI)
	@Override
	CustProductSaleResponse mapToDTO(EOCustProductSale eoInvProduct);
	
	CustProductRetailSaleResponse mapToDTO(EOCustProductRetailSale eoCustProductRetailSale);
	
	EOCustProductRetailSale mapToDAO(CustProductRetailSaleResponse custProductRetailSaleResponse);
	
	CustProductWholeSaleResponse mapToDTO(EOCustProductWholeSale eoCustProductWholeSale);
	
	EOCustProductWholeSale mapToDAO(CustProductWholeSaleResponse custProductWholeSaleResponse);
	
}
