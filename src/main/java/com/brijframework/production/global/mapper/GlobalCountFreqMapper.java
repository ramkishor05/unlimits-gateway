package com.brijframework.production.global.mapper;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.global.dto.UIGlobalCountFreq;
import com.brijframework.production.global.entities.EOGlobalCountFreq;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL)
public interface GlobalCountFreqMapper  extends GenericMapper<EOGlobalCountFreq, UIGlobalCountFreq>{

	@Override
	EOGlobalCountFreq mapToDAO(UIGlobalCountFreq globalCountFreq);
	
	@Override
    UIGlobalCountFreq mapToDTO(EOGlobalCountFreq eoGlobalCountFreq);
}
