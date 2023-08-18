package com.brijframework.production.mapper.cust;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.cust.EOCustCountFreq;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.cust.CustCountFreqResponse;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCountFreqResponseMapper  extends GenericMapper<EOCustCountFreq, CustCountFreqResponse>{

	@Override
	EOCustCountFreq mapToDAO(CustCountFreqResponse custCountFreqResponse);
	
	@Override
	CustCountFreqResponse mapToDTO(EOCustCountFreq eoCustCountFreq);
}
