package com.brijframework.production.global.mapper;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.global.dto.UIGlobalCategory;
import com.brijframework.production.global.entities.EOGlobalCategory;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL)
public interface GlobalCategoryMapper  extends GenericMapper<EOGlobalCategory, UIGlobalCategory>{

	@Override
	EOGlobalCategory mapToDAO(UIGlobalCategory uiGlobalCategory);
	
	@Override
	UIGlobalCategory mapToDTO(EOGlobalCategory eoGlobalCategory);
}
