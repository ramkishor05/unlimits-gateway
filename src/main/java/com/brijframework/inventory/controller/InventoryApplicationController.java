package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UIInventoryApplication;
import com.brijframework.inventory.bean.UIInventoryApplicationDetail;
import com.brijframework.inventory.bean.application.EOApplicationDTO;
import com.brijframework.inventory.feignclient.ApplicationClient;
import com.brijframework.inventory.service.InventoryApplicationService;

@RestController
@RequestMapping("inventory/application")
public class InventoryApplicationController {

	@Autowired
	InventoryApplicationService inventoryApplicationService;
	
	@Autowired
	ApplicationClient  appDetailServiceClient;
	
	@GetMapping
	public List<EOApplicationDTO> getInventory() {
		return appDetailServiceClient.getApplicationList();
	}
	
	@PostMapping
	public UIInventoryApplication addInventory(@RequestBody UIInventoryApplication inventoryApplication) {
		return inventoryApplicationService.saveInventoryApp(inventoryApplication);
	}
	
	@GetMapping("/{id}")
	public UIInventoryApplication getInventory(@PathVariable("id") long id) {
		return inventoryApplicationService.getInventoryApp(id);
	}
	
	@GetMapping("/{id}/detail")
	public UIInventoryApplicationDetail getInventoryDetail(@PathVariable("id") long id) {
		return inventoryApplicationService.getInventoryAppDetail(id);
	}
	
	
}
