package com.brijframework.production.mapper.global;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.entities.global.EOGlobalCategory;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.global.GlobalCategoryResponse;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL)
public interface GlobalCategoryResponseMapper  extends GenericMapper<EOGlobalCategory, GlobalCategoryResponse>{

	@Override
	EOGlobalCategory mapToDAO(GlobalCategoryResponse uiGlobalCategory);
	
	@Override
	GlobalCategoryResponse mapToDTO(EOGlobalCategory eoGlobalCategory);
}
