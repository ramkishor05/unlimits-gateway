package com.brijframework.production.cust.mapper;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.cust.dto.UICustCountFreq;
import com.brijframework.production.cust.entities.EOCustCountFreq;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCountFreqMapper  extends GenericMapper<EOCustCountFreq, UICustCountFreq>{

	@Override
	EOCustCountFreq mapToDAO(UICustCountFreq custCountFreq);
	
	@Override
    UICustCountFreq mapToDTO(EOCustCountFreq eoCustCountFreq);
}
