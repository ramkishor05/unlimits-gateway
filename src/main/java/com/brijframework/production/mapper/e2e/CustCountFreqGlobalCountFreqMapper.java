package com.brijframework.production.mapper.e2e;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.cust.EOCustCountFreq;
import com.brijframework.production.entities.global.EOGlobalCountFreq;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCountFreqGlobalCountFreqMapper  extends GenericMapper<EOCustCountFreq, EOGlobalCountFreq>{

	@Override
	EOCustCountFreq mapToDAO(EOGlobalCountFreq eoGlobalCountFreq);
	
	@Override
	EOGlobalCountFreq mapToDTO(EOCustCountFreq eoCustCountFreq);
}
