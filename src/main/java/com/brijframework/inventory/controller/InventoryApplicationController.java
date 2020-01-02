package com.brijframework.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UIInventoryApplication;
import com.brijframework.inventory.service.InventoryApplicationService;

@RestController
@RequestMapping("inventory/application")
public class InventoryApplicationController {

	@Autowired
	InventoryApplicationService inventoryApplicationService;
	
	@PostMapping
	public UIInventoryApplication addInventory(@RequestBody UIInventoryApplication inventoryApplication) {
		return inventoryApplicationService.saveInventoryApp(inventoryApplication);
	}
	
}
