package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UIStorage;
import com.brijframework.inventory.service.InventoryStorageService;

@RestController
@RequestMapping("inventory/storage")
public class InventoryStorageController {

	@Autowired
	InventoryStorageService inventoryStorageService;
	
	@PostMapping("/{inventoryAppId}")
	public UIStorage addStorage(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIStorage countFreq) {
		return inventoryStorageService.saveStorage(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UIStorage> getStorageList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryStorageService.getStorageList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UIStorage getStorageList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryStorageService.getStorage(inventoryAppId, typeId);
	}
}
