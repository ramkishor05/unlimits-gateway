package com.brijframework.production.cust.mapper;
import static com.brijframework.production.contants.Constants.*;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_ENTITY;
import static com.brijframework.production.contants.Constants.CUST_PROD_APP_ID_UI;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.production.cust.dto.UICustPreparation;
import com.brijframework.production.cust.entities.EOCustPreparation;
import com.brijframework.production.mapper.GenericMapper;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustPreparationMapper  extends GenericMapper<EOCustPreparation, UICustPreparation>{

	@Mapping(target=CUST_PROD_APP_ID_ENTITY, source=CUST_PROD_APP_ID_UI)
	@Mapping(target=GLB_IMAGE_ID_ENTITY, source=GLB_IMAGE_ID_UI)
	@Override
	EOCustPreparation mapToDAO(UICustPreparation uiCustPreparation);
	
	@Mapping(source=CUST_PROD_APP_ID_ENTITY, target=CUST_PROD_APP_ID_UI)
	@Mapping(source=GLB_IMAGE_ID_ENTITY, target=GLB_IMAGE_ID_UI)
	@Override
	UICustPreparation mapToDTO(EOCustPreparation eoInvPreparation);
}
