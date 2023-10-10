package com.brijframework.production.global.mapper;
import static com.brijframework.production.contants.Constants.*;
import org.mapstruct.Mapper;

import com.brijframework.production.global.dto.UIGlobalUnitGroup;
import com.brijframework.production.global.entities.EOGlobalUnitGroup;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_GLB_PRODUCTION_MAPPER_IMPL)
public interface GlobalUnitGroupMapper  extends GenericMapper<EOGlobalUnitGroup, UIGlobalUnitGroup>{

	@Override
	EOGlobalUnitGroup mapToDAO(UIGlobalUnitGroup uiGlobalUnitGroup);
	
	@Override
	UIGlobalUnitGroup mapToDTO(EOGlobalUnitGroup eoGlobalUnitGroup);
}
