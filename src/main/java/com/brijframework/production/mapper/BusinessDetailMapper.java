package com.brijframework.production.mapper;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.dto.UIBusinessDetail;
import com.brijframework.production.entities.EOBusiness;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL)
public interface BusinessDetailMapper extends GenericMapper<EOBusiness, UIBusinessDetail> {

}
