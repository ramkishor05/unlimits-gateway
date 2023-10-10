package com.brijframework.production.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.cust.dto.UICustProductionApp;
import com.brijframework.production.cust.dto.UICustProductionAppDetail;
import com.brijframework.production.cust.service.CustProductionAppService;

@RestController
@RequestMapping("api/cust/app")
public class CustApplicationController {

	@Autowired
	CustProductionAppService custApplicationService;
	
	@PostMapping
	public UICustProductionApp addInventory(@RequestBody UICustProductionApp inventoryApplication) {
		return custApplicationService.saveInventoryApp(inventoryApplication);
	}
	
	@GetMapping("/{appId}")
	public UICustProductionApp getInventory(@PathVariable("appId") long appId) {
		return custApplicationService.getInventoryApp(appId);
	}
	
	@GetMapping("/{appId}/detail")
	public UICustProductionAppDetail getInventoryDetail(@PathVariable("appId") long appId) {
		return custApplicationService.getInventoryAppDetail(appId);
	}
	
	
}
