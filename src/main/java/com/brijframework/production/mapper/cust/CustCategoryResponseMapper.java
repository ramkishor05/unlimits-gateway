package com.brijframework.production.mapper.cust;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.cust.EOCustCategory;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.cust.CustCategoryResponse;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCategoryResponseMapper  extends GenericMapper<EOCustCategory, CustCategoryResponse>{

	@Override
	EOCustCategory mapToDAO(CustCategoryResponse uiCustCategory);
	
	@Override
	CustCategoryResponse mapToDTO(EOCustCategory eoCustCategory);
}
