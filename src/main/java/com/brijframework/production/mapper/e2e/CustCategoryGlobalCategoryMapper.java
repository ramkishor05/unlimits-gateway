package com.brijframework.production.mapper.e2e;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.cust.EOCustCategory;
import com.brijframework.production.entities.global.EOGlobalCategory;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCategoryGlobalCategoryMapper  extends GenericMapper<EOCustCategory, EOGlobalCategory>{

	@Override
	EOCustCategory mapToDAO(EOGlobalCategory eoGlobalCategory);
	
	@Override
	EOGlobalCategory mapToDTO(EOCustCategory eoCustCategory);
}
