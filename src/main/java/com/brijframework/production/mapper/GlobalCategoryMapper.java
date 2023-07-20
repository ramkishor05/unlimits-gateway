package com.brijframework.production.mapper;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.dto.UIGlobalCategory;
import com.brijframework.production.entities.EOGlobalCategory;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL)
public interface GlobalCategoryMapper  extends GenericMapper<EOGlobalCategory, UIGlobalCategory>{

	@Override
	@Mapping(target = "categoryGroup.id", source = "categoryGroupId")
	EOGlobalCategory mapToDAO(UIGlobalCategory uiGlobalCategory);
	
	@Override
	@Mapping(source = "categoryGroup.id", target = "categoryGroupId")
	UIGlobalCategory mapToDTO(EOGlobalCategory eoGlobalCategory);
}
