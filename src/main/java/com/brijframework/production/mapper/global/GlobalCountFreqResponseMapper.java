package com.brijframework.production.mapper.global;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.EOGlobalCountFreq;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.global.GlobalCountFreqResponse;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL)
public interface GlobalCountFreqResponseMapper  extends GenericMapper<EOGlobalCountFreq, GlobalCountFreqResponse>{

	@Override
	EOGlobalCountFreq mapToDAO(GlobalCountFreqResponse globalCountFreqResponse);
	
	@Override
	GlobalCountFreqResponse mapToDTO(EOGlobalCountFreq eoGlobalCountFreq);
}
