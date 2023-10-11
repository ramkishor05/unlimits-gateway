package com.brijframework.production.cust.mapper;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.cust.dto.UICustUnitGroup;
import com.brijframework.production.cust.entities.EOCustUnitGroup;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustUnitGroupMapper  extends GenericMapper<EOCustUnitGroup, UICustUnitGroup>{
	

	@Override
	EOCustUnitGroup mapToDAO(UICustUnitGroup uiCustUnit);
	
	@Override
	UICustUnitGroup mapToDTO(EOCustUnitGroup eoCustUnitGroup);
}
