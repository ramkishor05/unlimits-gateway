package com.brijframework.production.mapper.cust;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.dto.cust.UICustCountFreq;
import com.brijframework.production.entities.cust.EOCustCountFreq;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCountFreqMapper  extends GenericMapper<EOCustCountFreq, UICustCountFreq>{

	@Override
	EOCustCountFreq mapToDAO(UICustCountFreq custCountFreq);
	
	@Override
    UICustCountFreq mapToDTO(EOCustCountFreq eoCustCountFreq);
}
