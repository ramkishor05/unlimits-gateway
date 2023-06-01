package com.brijframework.production.mapper;
import static com.brijframework.production.contants.Constants.*;
import org.mapstruct.Mapper;

import com.brijframework.production.dto.UIGlobalUnitGroup;
import com.brijframework.production.entities.EOGlobalUnitGroup;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL)
public interface GlobalUnitGroupMapper  extends GenericMapper<EOGlobalUnitGroup, UIGlobalUnitGroup>{

	@Override
	EOGlobalUnitGroup mapToDAO(UIGlobalUnitGroup uiGlobalUnitGroup);
	
	@Override
	UIGlobalUnitGroup mapToDTO(EOGlobalUnitGroup eoGlobalUnitGroup);
}
