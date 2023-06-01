package com.brijframework.production.mapper.cust;
import static com.brijframework.production.contants.Constants.*;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.dto.UICategory;
import com.brijframework.production.entities.cust.EOCustCategory;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustCategoryMapper  extends GenericMapper<EOCustCategory, UICategory>{
	

	@Mapping(target=CUST_PROD_APP_ID_ENTITY, source=CUST_PROD_APP_ID_UI)
	@Override
	EOCustCategory mapToDAO(UICategory eoRoleDTO);
	
	@Mapping(source=CUST_PROD_APP_ID_ENTITY, target=CUST_PROD_APP_ID_UI)
	@Override
	UICategory mapToDTO(EOCustCategory eoRole);
}
