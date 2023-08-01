package com.brijframework.production.mapper.global;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.global.EOGlobalCountFreq;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.global.GlobalCountFreqRequest;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL)
public interface GlobalCountFreqRequestMapper  extends GenericMapper<EOGlobalCountFreq, GlobalCountFreqRequest>{

	@Override
	EOGlobalCountFreq mapToDAO(GlobalCountFreqRequest globalCountFreqRequest);
	
	@Override
	GlobalCountFreqRequest mapToDTO(EOGlobalCountFreq eoGlobalCountFreq);
}
