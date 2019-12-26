package com.brijframework.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UIInventory;
import com.brijframework.inventory.model.EOInventory;
import com.brijframework.inventory.repository.InventoryRepository;
import com.brijframework.inventory.service.InventoryService;

@RestController
@RequestMapping("inventory")
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;
	
	@PostMapping
	public UIInventory addInventory(@RequestBody UIInventory inventory) {
		
		return inventoryService.saveInventory(inventory);
	}

}
