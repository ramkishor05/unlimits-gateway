package com.brijframework.production.mapper;
import static com.brijframework.production.contants.Constants.*;

import org.mapstruct.Mapper;

import com.brijframework.production.dto.UIGlobalCategoryGroup;
import com.brijframework.production.entities.EOGlobalCategoryGroup;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL)
public interface GlobalCategoryGroupMapper  extends GenericMapper<EOGlobalCategoryGroup, UIGlobalCategoryGroup>{

	@Override
	EOGlobalCategoryGroup mapToDAO(UIGlobalCategoryGroup eoRoleDTO);
	
	@Override
	UIGlobalCategoryGroup mapToDTO(EOGlobalCategoryGroup eoRole);
}
