package com.brijframework.inventory.feignclient;

import java.util.List;

import com.brijframework.inventory.bean.application.EOAppRoleDTO;

public interface AppRoleServiceClient {

	boolean deleteAppRole(Long applicationDTO);

	boolean deleteAppRole(EOAppRoleDTO applicationDTO);

	List<EOAppRoleDTO> saveAppRoleList(List<EOAppRoleDTO> applicationDTOs);

	EOAppRoleDTO saveAppRole(EOAppRoleDTO applicationDTO);

	EOAppRoleDTO getAppRole(Long appRoleDTO);

	List<EOAppRoleDTO> getAppRoleList();

}
