package com.brijframework.production.mapper;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.dto.UIGlobalCountFreq;
import com.brijframework.production.entities.EOGlobalCountFreq;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL)
public interface GlobalCountFreqMapper  extends GenericMapper<EOGlobalCountFreq, UIGlobalCountFreq>{

	@Override
	EOGlobalCountFreq mapToDAO(UIGlobalCountFreq globalCountFreq);
	
	@Override
    UIGlobalCountFreq mapToDTO(EOGlobalCountFreq eoGlobalCountFreq);
}
