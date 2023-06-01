package com.brijframework.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.cust.UICustLocation;
import com.brijframework.production.service.cust.CustLocationService;

@RestController
@RequestMapping("inventory/location")
public class InventoryLocationController {

	@Autowired
	CustLocationService inventoryLocationService;
	
	@PostMapping("/{inventoryAppId}")
	public UICustLocation addLocation(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UICustLocation countFreq) {
		return inventoryLocationService.saveLocation(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UICustLocation> getLocationList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryLocationService.getLocationList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UICustLocation getLocationList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryLocationService.getLocation(inventoryAppId, typeId);
	}
}
