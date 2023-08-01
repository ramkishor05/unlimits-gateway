package com.brijframework.production.mapper.cust;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_ENTITY;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_UI;
import static com.brijframework.production.contants.Constants.*;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.entities.cust.EOCustProductRetailSale;
import com.brijframework.production.entities.cust.EOCustProductSale;
import com.brijframework.production.entities.cust.EOCustProductWholeSale;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.cust.CustProductRetailSaleRequest;
import com.brijframework.production.rest.cust.CustProductSaleRequest;
import com.brijframework.production.rest.cust.CustProductWholeSaleRequest;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustProductSaleRequestMapper extends GenericMapper<EOCustProductSale, CustProductSaleRequest> {


	@Mapping(target = CUST_PROD_APP_ID_ENTITY, source = CUST_PROD_APP_ID_UI)
	@Override
	EOCustProductSale mapToDAO(CustProductSaleRequest custProductSaleRequest);

	@Mapping(source = CUST_PROD_APP_ID_ENTITY, target = CUST_PROD_APP_ID_UI)
	@Override
	CustProductSaleRequest mapToDTO(EOCustProductSale eoCustProductSale);

	@Mapping(target = CUST_PURCHASE_UNIT_ID_ENTITY, source = CUST_PURCHASE_UNIT_ID_UI)
	@Mapping(target = CUST_RETAIL_UNIT_ID_ENTITY, source = CUST_RETAIL_UNIT_ID_UI)
	EOCustProductRetailSale mapToDAO(CustProductRetailSaleRequest custProductRetailSaleRequest);

	@Mapping(source = CUST_PURCHASE_UNIT_ID_ENTITY, target = CUST_PURCHASE_UNIT_ID_UI)
	@Mapping(source = CUST_RETAIL_UNIT_ID_ENTITY, target = CUST_RETAIL_UNIT_ID_UI)
	CustProductRetailSaleRequest mapToDTO(EOCustProductRetailSale eoCustProductRetailSale);

	@Mapping(target = CUST_PURCHASE_UNIT_ID_ENTITY, source = CUST_PURCHASE_UNIT_ID_UI)
	@Mapping(target = CUST_WHOLE_UNIT_ID_ENTITY, source = CUST_WHOLE_UNIT_ID_UI)
	EOCustProductWholeSale mapToDAO(CustProductWholeSaleRequest custProductWholeSaleRequest);

	@Mapping(source = CUST_PURCHASE_UNIT_ID_ENTITY, target = CUST_PURCHASE_UNIT_ID_UI)
	@Mapping(source = CUST_WHOLE_UNIT_ID_ENTITY, target = CUST_WHOLE_UNIT_ID_UI)
	CustProductWholeSaleRequest mapToDTO(EOCustProductWholeSale eoCustProductWholeSale);

}
