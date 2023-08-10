package com.brijframework.production.mapper.e2e;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.cust.EOCustUnitGroup;
import com.brijframework.production.entities.global.EOGlobalUnitGroup;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustUnitGroupGlobalUnitGroupMapper  extends GenericMapper<EOCustUnitGroup, EOGlobalUnitGroup>{

	@Override
	EOCustUnitGroup mapToDAO(EOGlobalUnitGroup eoGlobalUnitGroup);
	
	@Override
	EOGlobalUnitGroup mapToDTO(EOCustUnitGroup eoCustUnitGroup);
}
