package com.brijframework.inventory.feignclient;

import java.util.List;

import com.brijframework.inventory.bean.application.EOAppEditionDTO;

public interface AppEditionServiceClient {

	EOAppEditionDTO saveAppEdition(EOAppEditionDTO applicationDTO);

	List<EOAppEditionDTO> saveAppEditionList(List<EOAppEditionDTO> applicationDTOs);

	List<EOAppEditionDTO> getAppEditionList();

	EOAppEditionDTO getAppEdition(Long appEditionDTO);

	boolean deleteAppEdition(EOAppEditionDTO applicationDTO);

	boolean deleteAppEdition(Long applicationDTO);

}
