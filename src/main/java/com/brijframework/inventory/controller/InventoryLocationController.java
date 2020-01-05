package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UILocation;
import com.brijframework.inventory.service.InventoryLocationService;

@RestController
@RequestMapping("inventory/location")
public class InventoryLocationController {

	@Autowired
	InventoryLocationService inventoryLocationService;
	
	@PostMapping("/{inventoryAppId}")
	public UILocation addLocation(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UILocation countFreq) {
		return inventoryLocationService.saveLocation(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UILocation> getLocationList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryLocationService.getLocationList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UILocation getLocationList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryLocationService.getLocation(inventoryAppId, typeId);
	}
}
