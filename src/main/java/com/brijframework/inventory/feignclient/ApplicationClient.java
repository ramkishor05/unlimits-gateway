package com.brijframework.inventory.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.brijframework.inventory.bean.application.EOApplicationDTO;

@FeignClient("project-brijframework-application")
public interface ApplicationClient {

	@GetMapping("/application")
	List<EOApplicationDTO> getApplicationList();

	@GetMapping("/application/{applicationId}")
	EOApplicationDTO getApplication(@PathVariable Long applicationId);

}
