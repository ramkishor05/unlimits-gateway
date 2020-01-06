package com.brijframework.inventory.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.brijframework.inventory.bean.useraccount.UserAccountResponse;

@FeignClient("project-brijframework-useraccount")
public interface UseraccountClient {
	
	@GetMapping("api/useraccount/{id}")
	public UserAccountResponse getUserAccount(@PathVariable long id);

}
