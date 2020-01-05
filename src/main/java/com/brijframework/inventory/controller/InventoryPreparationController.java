package com.brijframework.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.bean.UIPreparation;
import com.brijframework.inventory.service.InventoryPreparationService;

@RestController
@RequestMapping("inventory/preparation")
public class InventoryPreparationController {

	@Autowired
	InventoryPreparationService inventoryPreparationService;
	
	@PostMapping("/{inventoryAppId}")
	public UIPreparation addPreparation(@PathVariable("inventoryAppId") long inventoryAppId,@RequestBody UIPreparation countFreq) {
		return inventoryPreparationService.savePreparation(inventoryAppId,countFreq);
	}
	
	@GetMapping("/{inventoryAppId}")
	public List<UIPreparation> getPreparationList(@PathVariable("inventoryAppId") long inventoryAppId) {
		return inventoryPreparationService.getPreparationList(inventoryAppId);
	}
	
	@GetMapping("/{inventoryAppId}/{typeId}")
	public UIPreparation getPreparationList(@PathVariable("inventoryAppId") long inventoryAppId,@PathVariable("typeId") String typeId) {
		return inventoryPreparationService.getPreparation(inventoryAppId, typeId);
	}
}
