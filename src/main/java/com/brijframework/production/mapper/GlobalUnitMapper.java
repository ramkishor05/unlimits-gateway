package com.brijframework.production.mapper;
import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.dto.UIGlobalUnit;
import com.brijframework.production.entities.EOGlobalUnit;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL)
public interface GlobalUnitMapper  extends GenericMapper<EOGlobalUnit, UIGlobalUnit>{

	@Mapping(target="unitGroup.id", source="unitGroupId")
	@Override
	EOGlobalUnit mapToDAO(UIGlobalUnit eoRoleDTO);
	
	@Mapping(source="unitGroup.id", target="unitGroupId")
	@Override
	UIGlobalUnit mapToDTO(EOGlobalUnit eoRole);
}
