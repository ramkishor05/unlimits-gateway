package com.brijframework.production.mapper;

import static com.brijframework.production.contants.Constants.COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.production.contants.Constants.SPRING;

import org.mapstruct.Mapper;

import com.brijframework.production.dto.UIVendorDetail;
import com.brijframework.production.entities.EOVendor;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_PRODUCTION_MAPPER_IMPL)
public interface VendorDetailMapper extends GenericMapper<EOVendor, UIVendorDetail> {

}
