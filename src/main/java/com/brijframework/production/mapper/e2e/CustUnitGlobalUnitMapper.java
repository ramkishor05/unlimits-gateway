package com.brijframework.production.mapper.e2e;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.cust.EOCustUnit;
import com.brijframework.production.entities.global.EOGlobalUnit;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustUnitGlobalUnitMapper  extends GenericMapper<EOCustUnit, EOGlobalUnit>{

	@Override
	EOCustUnit mapToDAO(EOGlobalUnit eoGlobalUnit);
	
	@Override
	EOGlobalUnit mapToDTO(EOCustUnit eoCustUnit);
}
