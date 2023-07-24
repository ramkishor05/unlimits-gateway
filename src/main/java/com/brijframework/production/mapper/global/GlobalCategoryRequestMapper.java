package com.brijframework.production.mapper.global;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.entities.EOGlobalCategory;
import com.brijframework.production.mapper.GenericMapper;
import com.brijframework.production.rest.global.GlobalCategoryRequest;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL)
public interface GlobalCategoryRequestMapper  extends GenericMapper<EOGlobalCategory, GlobalCategoryRequest>{

	@Override
	@Mapping(target = "globalCategoryGroup.id", source = "glbCategoryGroupId")
	EOGlobalCategory mapToDAO(GlobalCategoryRequest globalCategoryRequest);
	
	@Override
	@Mapping(source = "globalCategoryGroup.id", target = "glbCategoryGroupId")
	GlobalCategoryRequest mapToDTO(EOGlobalCategory eoGlobalCategory);
}
