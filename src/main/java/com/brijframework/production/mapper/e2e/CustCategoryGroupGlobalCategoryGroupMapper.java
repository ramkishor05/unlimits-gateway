package com.brijframework.production.mapper.e2e;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.cust.entities.EOCustCategoryGroup;
import com.brijframework.production.global.entities.EOGlobalCategoryGroup;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCategoryGroupGlobalCategoryGroupMapper  extends GenericMapper<EOCustCategoryGroup, EOGlobalCategoryGroup>{

	@Override
	EOCustCategoryGroup mapToDAO(EOGlobalCategoryGroup eoGlobalCategoryGroup);
	
	@Override
	EOGlobalCategoryGroup mapToDTO(EOCustCategoryGroup eoCustCategoryGroup);
}
