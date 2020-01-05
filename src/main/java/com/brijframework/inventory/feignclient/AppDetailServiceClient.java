package com.brijframework.inventory.feignclient;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.brijframework.inventory.bean.application.EOApplicationDTO;

public interface AppDetailServiceClient {

	@PostMapping
	EOApplicationDTO saveApplication(@RequestBody EOApplicationDTO applicationDTO);

	@PostMapping("list")
	List<EOApplicationDTO> saveApplicationList(@RequestBody List<EOApplicationDTO> applicationDTOs);
	
	@GetMapping
	List<EOApplicationDTO> getApplicationList();

	@GetMapping("/{applicationId}")
	EOApplicationDTO getApplication(@PathVariable Long applicationId);

	@DeleteMapping("/{applicationId}")
	boolean deleteApplication(@PathVariable Long applicationId);

}
