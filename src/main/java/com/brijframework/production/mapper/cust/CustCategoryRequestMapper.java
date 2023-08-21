package com.brijframework.production.mapper.cust;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.entities.cust.EOCustCategory;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.cust.CustCategoryRequest;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCategoryRequestMapper  extends GenericMapper<EOCustCategory, CustCategoryRequest>{

	@Override
	@Mapping(target = "custImageDetail.id", source = "custImageDetailId")
	@Mapping(target = "custCategoryGroup.id", source = "custCategoryGroupId")
	EOCustCategory mapToDAO(CustCategoryRequest custCategoryRequest);
	
	@Override
	@Mapping(source = "custImageDetail.id", target = "custImageDetailId")
	@Mapping(source = "custCategoryGroup.id", target = "custCategoryGroupId")
	CustCategoryRequest mapToDTO(EOCustCategory eoCustCategory);
}
