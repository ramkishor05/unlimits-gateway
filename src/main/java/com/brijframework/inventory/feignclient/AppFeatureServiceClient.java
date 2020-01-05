package com.brijframework.inventory.feignclient;

import java.util.List;

import com.brijframework.inventory.bean.application.EOAppFeatureDTO;

public interface AppFeatureServiceClient {

	List<EOAppFeatureDTO> getAppFeatureList();

	EOAppFeatureDTO getAppFeature(Long appFeatureDTO);

	EOAppFeatureDTO saveAppFeature(EOAppFeatureDTO applicationDTO);

	List<EOAppFeatureDTO> saveAppFeatureList(List<EOAppFeatureDTO> applicationDTOs);

	boolean deleteAppFeature(EOAppFeatureDTO applicationDTO);

	boolean deleteAppFeature(Long applicationDTO);

}
