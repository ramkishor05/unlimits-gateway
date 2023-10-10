package com.brijframework.production.cust.mapper;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.cust.entities.EOCustCountFreq;
import com.brijframework.production.cust.rest.CustCountFreqRequest;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCountFreqRequestMapper  extends GenericMapper<EOCustCountFreq, CustCountFreqRequest>{

	@Override
	EOCustCountFreq mapToDAO(CustCountFreqRequest custCountFreqRequest);
	
	@Override
	CustCountFreqRequest mapToDTO(EOCustCountFreq eoCustCountFreq);
}
