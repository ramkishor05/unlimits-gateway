package com.brijframework.production.mapper.global;
import static com.brijframework.production.contants.Constants.*;

import org.mapstruct.Mapper;

import com.brijframework.production.dto.global.UIGlobalCategoryGroup;
import com.brijframework.production.entities.global.EOGlobalCategoryGroup;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL)
public interface GlobalCategoryGroupMapper  extends GenericMapper<EOGlobalCategoryGroup, UIGlobalCategoryGroup>{

	@Override
	EOGlobalCategoryGroup mapToDAO(UIGlobalCategoryGroup eoRoleDTO);
	
	@Override
	UIGlobalCategoryGroup mapToDTO(EOGlobalCategoryGroup eoRole);
}
