package com.brijframework.inventory.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.brijframework.inventory.bean.useraccount.LoginRequest;
import com.brijframework.inventory.bean.useraccount.TokenDTO;

@FeignClient("project-brijframework-useraccount")
public interface AuthenticationClient {

	@RequestMapping(value = "/api/authentication/token/generate", method = RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody LoginRequest loginUser);

	@RequestMapping(value = "/api/authentication/token/validate", method = RequestMethod.POST)
	public ResponseEntity<?> validateToken(@RequestBody TokenDTO tokenDTO);
}
