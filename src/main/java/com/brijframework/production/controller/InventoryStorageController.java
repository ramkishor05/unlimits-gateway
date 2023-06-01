package com.brijframework.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.cust.UICustStorage;
import com.brijframework.production.service.cust.CustStorageService;

@RestController
@RequestMapping("inventory/storage")
public class InventoryStorageController {

	@Autowired
	CustStorageService inventoryStorageService;
	
	@PostMapping("/{inventoryAppId}")
	public UICustStorage addStorage(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICustStorage countFreq) {
		return inventoryStorageService.saveStorage(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UICustStorage> getStorageList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryStorageService.getStorageList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UICustStorage getStorageList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryStorageService.getStorage(inventoryAppId, typeId);
	}
}
