package com.brijframework.production.mapper.cust;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.dto.cust.UICustCategoryGroup;
import com.brijframework.production.entities.cust.EOCustCategoryGroup;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCategoryGroupMapper  extends GenericMapper<EOCustCategoryGroup, UICustCategoryGroup>{

	@Override
	EOCustCategoryGroup mapToDAO(UICustCategoryGroup uiCustCategoryGroup);
	
	@Override
	UICustCategoryGroup mapToDTO(EOCustCategoryGroup eoCustCategoryGroup);
}
